package com.itmuch.cloud.study.account.dao;

import com.itmuch.cloud.study.account.entity.ContractTemplate;
import com.itmuch.cloud.study.account.entity.ContractTemplateExample;
import com.itmuch.cloud.study.common.util.Page;
import java.util.List;

public interface ContractTemplateDao {
    int insert(ContractTemplate record);

    int save(ContractTemplate record);

    int deleteByExample(ContractTemplateExample example);

    int deleteById(Long id);

    int updateById(ContractTemplate record);

    int updateByPrimaryKey(ContractTemplate record);

    int updateByExampleSelective(ContractTemplate record, ContractTemplateExample example);

    int updateByExample(ContractTemplate record, ContractTemplateExample example);

    ContractTemplate getById(Long id);

    List<ContractTemplate> listByExample(ContractTemplateExample example);

    int countByExample(ContractTemplateExample example);

    Page<ContractTemplate> listForPage(int pageCurrent, int pageSize, ContractTemplateExample example);
}