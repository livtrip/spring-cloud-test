package com.itmuch.cloud.study.account.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.itmuch.cloud.study.account.bean.constant.Const;
import com.itmuch.cloud.study.account.bean.dto.UserDTO;
import com.itmuch.cloud.study.account.bean.enums.UserLoginTypeEnum;
import com.itmuch.cloud.study.account.bean.qo.UserQO;
import com.itmuch.cloud.study.account.dao.UserDao;
import com.itmuch.cloud.study.account.entity.User;
import com.itmuch.cloud.study.account.entity.UserExample;
import com.itmuch.cloud.study.account.service.UserService;
import com.itmuch.cloud.study.common.util.GeneratorUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Value("${wx.mini.app-id}")
    private String wxMiNiAppid;
    @Value("${wx.mini.app-secret}")
    private String wxMiNiSecret;

    @Value("${wx.app.app-id}")
    private String wxAppAppid;
    @Value("${wx.app.app-secret}")
    private String wxAppSecret;


    @Autowired
    private UserDao userDao;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    /**
     * 微信小程序授权登陆
     * @param loginType 登陆类型
     * @param ip IP
     * @param raw 授权码信息
     * @return 用户模型
     */
    @Override
    public UserDTO wechatLogin(Integer loginType, String ip, String raw){
        UserDTO userDTO = new UserDTO();
        //处理小程序登陆逻辑
        if(loginType == UserLoginTypeEnum.MP_WEIXIN.getCode()){
            JSONObject thirdPartJsonObject = JSONObject.parseObject(raw);
            String code = thirdPartJsonObject.getString("code");
            //构建请求链接
            StringBuilder requestUrl = new StringBuilder();
            requestUrl.append("https://api.weixin.qq.com/sns/jscode2session?appid=").append(wxMiNiAppid).append("&secret=").append(wxMiNiSecret)
                    .append("&grant_type=authorization_code&js_code=").append(code);
            String resultJson = HttpRequest.get(requestUrl.toString()).execute().body();
            JSONObject jsonObject = JSONObject.parseObject(resultJson);
            Integer errCode = jsonObject.getInteger("errcode");
            if(errCode == null || errCode == 0) {
                String miniOpenId = jsonObject.getString("openid");
                List<User> userList = queryForList(UserQO.builder().loginType(loginType).openId(miniOpenId).build());
                User returnUser = null;
                if(CollectionUtil.isEmpty(userList)){
                    //新用户执行新增
                    User user = new User();
                    user.setOpenId(miniOpenId);
                    user.setLoginType(loginType);
                    Long userId = userDao.save(user);
                    returnUser = userDao.getById(userId);
                }else{
                    //老用户执行更新
                    returnUser = userList.get(0);
                    returnUser.setLastLoginIp(ip);
                    int count = updateByCondition(returnUser, UserQO.builder().id(returnUser.getId()).build());
                }
                String accessToken = GeneratorUtil.genSessionId();
                userDTO.setAccessToken(accessToken);

                //设置token过期时间 TODO 重新梳理这段逻辑
                stringRedisTemplate.opsForValue().set(Const.ADMIN_ACCESS_TOKEN, JSON.toJSONString(userDTO));
                BeanUtils.copyProperties(returnUser, userDTO);
            }
        }

        return userDTO;
    }


    @Override
    public Integer updateByCondition(User user,UserQO qo){
        UserExample example = generateExample(qo);
        return userDao.updateByExample(user, example);
    }

    @Override
    public List<User> queryForList(UserQO qo){
        UserExample example = generateExample(qo);
        return userDao.listByExample(example);
    }

    @Override
    public Integer countByCondition(UserQO qo) {
        UserExample example = generateExample(qo);
        return userDao.countByExample(example);
    }

    public UserExample generateExample(UserQO qo){
        UserExample example = new UserExample();
        UserExample.Criteria c = example.createCriteria();
        example.setOrderByClause("id desc");
        if(qo.getLoginType() != null){
            c.andLoginTypeEqualTo(qo.getLoginType());
        }
        if(StringUtils.isNoneBlank(qo.getOpenId())){
            c.andOpenIdEqualTo(qo.getOpenId());
        }
        if(qo.getId() != null){
            c.andIdEqualTo(qo.getId());
        }

        return example;
    }

}
