package com.itmuch.cloud.study.account.dao;

import com.itmuch.cloud.study.account.entity.UserIdentityInfo;
import com.itmuch.cloud.study.account.entity.UserIdentityInfoExample;
import com.itmuch.cloud.study.common.util.Page;
import java.util.List;

public interface UserIdentityInfoDao {
    int insert(UserIdentityInfo record);

    int save(UserIdentityInfo record);

    int deleteByExample(UserIdentityInfoExample example);

    int deleteById(Long id);

    int updateById(UserIdentityInfo record);

    int updateByPrimaryKey(UserIdentityInfo record);

    int updateByExampleSelective(UserIdentityInfo record, UserIdentityInfoExample example);

    int updateByExample(UserIdentityInfo record, UserIdentityInfoExample example);

    UserIdentityInfo getById(Long id);

    List<UserIdentityInfo> listByExample(UserIdentityInfoExample example);

    int countByExample(UserIdentityInfoExample example);

    Page<UserIdentityInfo> listForPage(int pageCurrent, int pageSize, UserIdentityInfoExample example);
}