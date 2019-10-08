package com.itmuch.cloud.study.payment.dao.impl.mapper;

import com.itmuch.cloud.study.payment.entity.PayRefund;
import com.itmuch.cloud.study.payment.entity.PayRefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayRefundMapper {
    int countByExample(PayRefundExample example);

    int deleteByExample(PayRefundExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PayRefund record);

    int insertSelective(PayRefund record);

    List<PayRefund> selectByExample(PayRefundExample example);

    PayRefund selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PayRefund record, @Param("example") PayRefundExample example);

    int updateByExample(@Param("record") PayRefund record, @Param("example") PayRefundExample example);

    int updateByPrimaryKeySelective(PayRefund record);

    int updateByPrimaryKey(PayRefund record);
}