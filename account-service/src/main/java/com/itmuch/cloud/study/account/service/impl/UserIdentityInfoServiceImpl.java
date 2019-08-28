package com.itmuch.cloud.study.account.service.impl;

import com.itmuch.cloud.study.account.bean.qo.UserIdentityInfoQO;
import com.itmuch.cloud.study.account.dao.UserIdentityInfoDao;
import com.itmuch.cloud.study.account.dao.impl.mapper.UserIdentityInfoMapper;
import com.itmuch.cloud.study.account.entity.User;
import com.itmuch.cloud.study.account.entity.UserIdentityInfo;
import com.itmuch.cloud.study.account.entity.UserIdentityInfoExample;
import com.itmuch.cloud.study.account.service.UserIdentityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * Description:
 *
 * @author xierongli
 * @create 2019-08-28 22:25
 */
@Service
public class UserIdentityInfoServiceImpl implements UserIdentityInfoService {

    @Autowired
    private UserIdentityInfoDao userIdentityInfoDao;


    @Override
    public Integer updateByCondition(UserIdentityInfo userIdentityInfo, UserIdentityInfoQO qo) {
        UserIdentityInfoExample example = generate(qo);
        return userIdentityInfoDao.updateByExample(userIdentityInfo, example);
    }

    @Override
    public List<UserIdentityInfo> queryForList(UserIdentityInfoQO qo) {
        UserIdentityInfoExample example = generate(qo);
        return userIdentityInfoDao.listByExample(example);
    }

    @Override
    public Integer countByCondition(UserIdentityInfoQO qo) {
        UserIdentityInfoExample example = generate(qo);
        return userIdentityInfoDao.countByExample(example);
    }

    @Override
    public Integer insert(UserIdentityInfo userIdentityInfo) {
        return userIdentityInfoDao.save(userIdentityInfo);
    }


    public UserIdentityInfoExample generate(UserIdentityInfoQO qo){
        UserIdentityInfoExample example = new UserIdentityInfoExample();
        example.setOrderByClause("id desc");
        UserIdentityInfoExample.Criteria c = example.createCriteria();
        if(qo.getUserId() != null){
            c.andUserIdEqualTo(qo.getUserId());
        }
        return example;
    }
}
