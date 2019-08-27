package com.itmuch.cloud.study.account.dao.impl.mapper;

import com.itmuch.cloud.study.account.entity.AdminInfo;
import com.itmuch.cloud.study.account.entity.AdminInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminInfoMapper {
    int countByExample(AdminInfoExample example);

    int deleteByExample(AdminInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    List<AdminInfo> selectByExample(AdminInfoExample example);

    AdminInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);

    int updateByExample(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);
}