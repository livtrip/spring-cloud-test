package com.itmuch.cloud.study.account.dao.impl;

import com.itmuch.cloud.study.account.dao.UserDao;
import com.itmuch.cloud.study.account.dao.impl.mapper.UserMapper;
import com.itmuch.cloud.study.account.entity.User;
import com.itmuch.cloud.study.account.entity.UserExample;
import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserMapper userMapper;

    public int insert(User record) {
        return this.userMapper.insert(record);
    }

    public int save(User record) {
        return this.userMapper.insertSelective(record);
    }

    public int deleteByExample(UserExample example) {
        return this.userMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.userMapper.deleteByPrimaryKey(id);
    }

    public int updateById(User record) {
        return this.userMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record) {
        return this.userMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(User record, UserExample example) {
        return this.userMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(User record, UserExample example) {
        return this.userMapper.updateByExample(record, example);
    }

    public List<User> listByExample(UserExample example) {
        return this.userMapper.selectByExample(example);
    }

    public User getById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    public int countByExample(UserExample example) {
        return this.userMapper.countByExample(example);
    }

    public Page<User> listForPage(int pageCurrent, int pageSize, UserExample example) {
        int count = this.userMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<User>(count, totalPage, pageCurrent, pageSize, this.userMapper.selectByExample(example));
    }
}