package com.itmuch.cloud.study.account.dao.impl;

import com.itmuch.cloud.study.account.dao.ContractTemplateDao;
import com.itmuch.cloud.study.account.dao.impl.mapper.ContractTemplateMapper;
import com.itmuch.cloud.study.account.entity.ContractTemplate;
import com.itmuch.cloud.study.account.entity.ContractTemplateExample;
import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContractTemplateDaoImpl implements ContractTemplateDao {
    @Autowired
    private ContractTemplateMapper contractTemplateMapper;

    public int insert(ContractTemplate record) {
        return this.contractTemplateMapper.insert(record);
    }

    public int save(ContractTemplate record) {
        return this.contractTemplateMapper.insertSelective(record);
    }

    public int deleteByExample(ContractTemplateExample example) {
        return this.contractTemplateMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.contractTemplateMapper.deleteByPrimaryKey(id);
    }

    public int updateById(ContractTemplate record) {
        return this.contractTemplateMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ContractTemplate record) {
        return this.contractTemplateMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(ContractTemplate record, ContractTemplateExample example) {
        return this.contractTemplateMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(ContractTemplate record, ContractTemplateExample example) {
        return this.contractTemplateMapper.updateByExample(record, example);
    }

    public List<ContractTemplate> listByExample(ContractTemplateExample example) {
        return this.contractTemplateMapper.selectByExample(example);
    }

    public ContractTemplate getById(Long id) {
        return this.contractTemplateMapper.selectByPrimaryKey(id);
    }

    public int countByExample(ContractTemplateExample example) {
        return this.contractTemplateMapper.countByExample(example);
    }

    public Page<ContractTemplate> listForPage(int pageCurrent, int pageSize, ContractTemplateExample example) {
        int count = this.contractTemplateMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<ContractTemplate>(count, totalPage, pageCurrent, pageSize, this.contractTemplateMapper.selectByExample(example));
    }
}