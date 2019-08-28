package com.itmuch.cloud.study.account.dao;

import com.itmuch.cloud.study.account.entity.User;
import com.itmuch.cloud.study.account.entity.UserExample;
import com.itmuch.cloud.study.common.util.Page;
import java.util.List;

public interface UserDao {
    int insert(User record);

    int save(User record);

    int deleteByExample(UserExample example);

    int deleteById(Long id);

    int updateById(User record);

    int updateByPrimaryKey(User record);

    int updateByExampleSelective(User record, UserExample example);

    int updateByExample(User record, UserExample example);

    User getById(Long id);

    List<User> listByExample(UserExample example);

    int countByExample(UserExample example);

    Page<User> listForPage(int pageCurrent, int pageSize, UserExample example);
}