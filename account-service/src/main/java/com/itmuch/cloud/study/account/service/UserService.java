package com.itmuch.cloud.study.account.service;

import com.itmuch.cloud.study.account.bean.dto.UserDTO;
import com.itmuch.cloud.study.account.bean.qo.UserQO;
import com.itmuch.cloud.study.account.entity.User;

import java.util.List;

public interface UserService {

    UserDTO wechatLogin(Integer loginType, String ip, String raw);

    Integer updateByCondition(User user, UserQO qo);

    List<User> queryForList(UserQO qo);

    Integer countByCondition(UserQO qo);
}
