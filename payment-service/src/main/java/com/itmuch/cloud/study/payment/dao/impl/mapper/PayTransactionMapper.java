package com.itmuch.cloud.study.payment.dao.impl.mapper;

import com.itmuch.cloud.study.payment.entity.PayTransaction;
import com.itmuch.cloud.study.payment.entity.PayTransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayTransactionMapper {
    int countByExample(PayTransactionExample example);

    int deleteByExample(PayTransactionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PayTransaction record);

    int insertSelective(PayTransaction record);

    List<PayTransaction> selectByExample(PayTransactionExample example);

    PayTransaction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PayTransaction record, @Param("example") PayTransactionExample example);

    int updateByExample(@Param("record") PayTransaction record, @Param("example") PayTransactionExample example);

    int updateByPrimaryKeySelective(PayTransaction record);

    int updateByPrimaryKey(PayTransaction record);
}