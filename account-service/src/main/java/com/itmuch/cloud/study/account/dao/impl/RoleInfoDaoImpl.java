package com.itmuch.cloud.study.account.dao.impl;

import com.itmuch.cloud.study.account.dao.RoleInfoDao;
import com.itmuch.cloud.study.account.dao.impl.mapper.RoleInfoMapper;
import com.itmuch.cloud.study.account.entity.RoleInfo;
import com.itmuch.cloud.study.account.entity.RoleInfoExample;
import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleInfoDaoImpl implements RoleInfoDao {
    @Autowired
    private RoleInfoMapper roleInfoMapper;

    public int insert(RoleInfo record) {
        return this.roleInfoMapper.insert(record);
    }

    public int save(RoleInfo record) {
        return this.roleInfoMapper.insertSelective(record);
    }

    public int deleteByExample(RoleInfoExample example) {
        return this.roleInfoMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.roleInfoMapper.deleteByPrimaryKey(id);
    }

    public int updateById(RoleInfo record) {
        return this.roleInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(RoleInfo record) {
        return this.roleInfoMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(RoleInfo record, RoleInfoExample example) {
        return this.roleInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(RoleInfo record, RoleInfoExample example) {
        return this.roleInfoMapper.updateByExample(record, example);
    }

    public List<RoleInfo> listByExample(RoleInfoExample example) {
        return this.roleInfoMapper.selectByExample(example);
    }

    public RoleInfo getById(Long id) {
        return this.roleInfoMapper.selectByPrimaryKey(id);
    }

    public int countByExample(RoleInfoExample example) {
        return this.roleInfoMapper.countByExample(example);
    }

    public Page<RoleInfo> listForPage(int pageCurrent, int pageSize, RoleInfoExample example) {
        int count = this.roleInfoMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<RoleInfo>(count, totalPage, pageCurrent, pageSize, this.roleInfoMapper.selectByExample(example));
    }
}