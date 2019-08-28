package com.itmuch.cloud.study.account.dao.impl.mapper;

import com.itmuch.cloud.study.account.entity.UserIdentityInfo;
import com.itmuch.cloud.study.account.entity.UserIdentityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserIdentityInfoMapper {
    int countByExample(UserIdentityInfoExample example);

    int deleteByExample(UserIdentityInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserIdentityInfo record);

    int insertSelective(UserIdentityInfo record);

    List<UserIdentityInfo> selectByExample(UserIdentityInfoExample example);

    UserIdentityInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserIdentityInfo record, @Param("example") UserIdentityInfoExample example);

    int updateByExample(@Param("record") UserIdentityInfo record, @Param("example") UserIdentityInfoExample example);

    int updateByPrimaryKeySelective(UserIdentityInfo record);

    int updateByPrimaryKey(UserIdentityInfo record);
}