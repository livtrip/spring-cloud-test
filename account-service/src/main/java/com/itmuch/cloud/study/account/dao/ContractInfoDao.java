package com.itmuch.cloud.study.account.dao;

import com.itmuch.cloud.study.account.entity.ContractInfo;
import com.itmuch.cloud.study.account.entity.ContractInfoExample;
import com.itmuch.cloud.study.common.util.Page;
import java.util.List;

public interface ContractInfoDao {
    int insert(ContractInfo record);

    int save(ContractInfo record);

    int deleteByExample(ContractInfoExample example);

    int deleteById(Long id);

    int updateById(ContractInfo record);

    int updateByPrimaryKey(ContractInfo record);

    int updateByExampleSelective(ContractInfo record, ContractInfoExample example);

    int updateByExample(ContractInfo record, ContractInfoExample example);

    ContractInfo getById(Long id);

    List<ContractInfo> listByExample(ContractInfoExample example);

    int countByExample(ContractInfoExample example);

    Page<ContractInfo> listForPage(int pageCurrent, int pageSize, ContractInfoExample example);
}