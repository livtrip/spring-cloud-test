package com.itmuch.cloud.study.account.dao.impl.mapper;

import com.itmuch.cloud.study.account.entity.ContractTemplate;
import com.itmuch.cloud.study.account.entity.ContractTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ContractTemplateMapper {
    int countByExample(ContractTemplateExample example);

    int deleteByExample(ContractTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContractTemplate record);

    int insertSelective(ContractTemplate record);

    List<ContractTemplate> selectByExample(ContractTemplateExample example);

    ContractTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContractTemplate record, @Param("example") ContractTemplateExample example);

    int updateByExample(@Param("record") ContractTemplate record, @Param("example") ContractTemplateExample example);

    int updateByPrimaryKeySelective(ContractTemplate record);

    int updateByPrimaryKey(ContractTemplate record);
}