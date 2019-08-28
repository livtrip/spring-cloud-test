package com.itmuch.cloud.study.account.dao.impl;

import com.itmuch.cloud.study.account.dao.UserIdentityInfoDao;
import com.itmuch.cloud.study.account.dao.impl.mapper.UserIdentityInfoMapper;
import com.itmuch.cloud.study.account.entity.UserIdentityInfo;
import com.itmuch.cloud.study.account.entity.UserIdentityInfoExample;
import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserIdentityInfoDaoImpl implements UserIdentityInfoDao {
    @Autowired
    private UserIdentityInfoMapper userIdentityInfoMapper;

    public int insert(UserIdentityInfo record) {
        return this.userIdentityInfoMapper.insert(record);
    }

    public int save(UserIdentityInfo record) {
        return this.userIdentityInfoMapper.insertSelective(record);
    }

    public int deleteByExample(UserIdentityInfoExample example) {
        return this.userIdentityInfoMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.userIdentityInfoMapper.deleteByPrimaryKey(id);
    }

    public int updateById(UserIdentityInfo record) {
        return this.userIdentityInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserIdentityInfo record) {
        return this.userIdentityInfoMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(UserIdentityInfo record, UserIdentityInfoExample example) {
        return this.userIdentityInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(UserIdentityInfo record, UserIdentityInfoExample example) {
        return this.userIdentityInfoMapper.updateByExample(record, example);
    }

    public List<UserIdentityInfo> listByExample(UserIdentityInfoExample example) {
        return this.userIdentityInfoMapper.selectByExample(example);
    }

    public UserIdentityInfo getById(Long id) {
        return this.userIdentityInfoMapper.selectByPrimaryKey(id);
    }

    public int countByExample(UserIdentityInfoExample example) {
        return this.userIdentityInfoMapper.countByExample(example);
    }

    public Page<UserIdentityInfo> listForPage(int pageCurrent, int pageSize, UserIdentityInfoExample example) {
        int count = this.userIdentityInfoMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<UserIdentityInfo>(count, totalPage, pageCurrent, pageSize, this.userIdentityInfoMapper.selectByExample(example));
    }
}