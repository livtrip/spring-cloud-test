package com.itmuch.cloud.study.account.dao.impl;

import com.itmuch.cloud.study.account.dao.AdminInfoDao;
import com.itmuch.cloud.study.account.dao.impl.mapper.AdminInfoMapper;
import com.itmuch.cloud.study.account.entity.AdminInfo;
import com.itmuch.cloud.study.account.entity.AdminInfoExample;
import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminInfoDaoImpl implements AdminInfoDao {
    @Autowired
    private AdminInfoMapper adminInfoMapper;

    public int insert(AdminInfo record) {
        return this.adminInfoMapper.insert(record);
    }

    public int save(AdminInfo record) {
        return this.adminInfoMapper.insertSelective(record);
    }

    public int deleteByExample(AdminInfoExample example) {
        return this.adminInfoMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.adminInfoMapper.deleteByPrimaryKey(id);
    }

    public int updateById(AdminInfo record) {
        return this.adminInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AdminInfo record) {
        return this.adminInfoMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(AdminInfo record, AdminInfoExample example) {
        return this.adminInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AdminInfo record, AdminInfoExample example) {
        return this.adminInfoMapper.updateByExample(record, example);
    }

    public List<AdminInfo> listByExample(AdminInfoExample example) {
        return this.adminInfoMapper.selectByExample(example);
    }

    public AdminInfo getById(Long id) {
        return this.adminInfoMapper.selectByPrimaryKey(id);
    }

    public int countByExample(AdminInfoExample example) {
        return this.adminInfoMapper.countByExample(example);
    }

    public Page<AdminInfo> listForPage(int pageCurrent, int pageSize, AdminInfoExample example) {
        int count = this.adminInfoMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<AdminInfo>(count, totalPage, pageCurrent, pageSize, this.adminInfoMapper.selectByExample(example));
    }
}