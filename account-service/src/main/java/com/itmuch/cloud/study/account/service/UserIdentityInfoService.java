package com.itmuch.cloud.study.account.service;

import com.itmuch.cloud.study.account.bean.qo.UserIdentityInfoQO;
import com.itmuch.cloud.study.account.entity.UserIdentityInfo;

import java.util.List;

public interface UserIdentityInfoService {

    Integer updateByCondition(UserIdentityInfo userIdentityInfo, UserIdentityInfoQO qo);

    List<UserIdentityInfo> queryForList(UserIdentityInfoQO qo);

    Integer countByCondition(UserIdentityInfoQO qo);

    Integer insert(UserIdentityInfo userIdentityInfo);

    Integer updateById(UserIdentityInfo userIdentityInfo);
}
