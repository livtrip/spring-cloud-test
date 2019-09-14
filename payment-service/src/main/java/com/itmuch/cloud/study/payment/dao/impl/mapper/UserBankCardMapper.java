package com.itmuch.cloud.study.payment.dao.impl.mapper;

import com.itmuch.cloud.study.payment.entity.UserBankCard;
import com.itmuch.cloud.study.payment.entity.UserBankCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserBankCardMapper {
    int countByExample(UserBankCardExample example);

    int deleteByExample(UserBankCardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserBankCard record);

    int insertSelective(UserBankCard record);

    List<UserBankCard> selectByExample(UserBankCardExample example);

    UserBankCard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserBankCard record, @Param("example") UserBankCardExample example);

    int updateByExample(@Param("record") UserBankCard record, @Param("example") UserBankCardExample example);

    int updateByPrimaryKeySelective(UserBankCard record);

    int updateByPrimaryKey(UserBankCard record);
}