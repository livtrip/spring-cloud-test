package com.itmuch.cloud.study.account.dao.impl;

import com.itmuch.cloud.study.account.dao.ContractInfoDao;
import com.itmuch.cloud.study.account.dao.impl.mapper.ContractInfoMapper;
import com.itmuch.cloud.study.account.entity.ContractInfo;
import com.itmuch.cloud.study.account.entity.ContractInfoExample;
import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContractInfoDaoImpl implements ContractInfoDao {
    @Autowired
    private ContractInfoMapper contractInfoMapper;

    public int insert(ContractInfo record) {
        return this.contractInfoMapper.insert(record);
    }

    public int save(ContractInfo record) {
        return this.contractInfoMapper.insertSelective(record);
    }

    public int deleteByExample(ContractInfoExample example) {
        return this.contractInfoMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.contractInfoMapper.deleteByPrimaryKey(id);
    }

    public int updateById(ContractInfo record) {
        return this.contractInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ContractInfo record) {
        return this.contractInfoMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(ContractInfo record, ContractInfoExample example) {
        return this.contractInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(ContractInfo record, ContractInfoExample example) {
        return this.contractInfoMapper.updateByExample(record, example);
    }

    public List<ContractInfo> listByExample(ContractInfoExample example) {
        return this.contractInfoMapper.selectByExample(example);
    }

    public ContractInfo getById(Long id) {
        return this.contractInfoMapper.selectByPrimaryKey(id);
    }

    public int countByExample(ContractInfoExample example) {
        return this.contractInfoMapper.countByExample(example);
    }

    public Page<ContractInfo> listForPage(int pageCurrent, int pageSize, ContractInfoExample example) {
        int count = this.contractInfoMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<ContractInfo>(count, totalPage, pageCurrent, pageSize, this.contractInfoMapper.selectByExample(example));
    }
}