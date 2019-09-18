package com.itmuch.cloud.study.payment.dao.impl.mapper;

import com.itmuch.cloud.study.payment.entity.PayLogData;
import com.itmuch.cloud.study.payment.entity.PayLogDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayLogDataMapper {
    int countByExample(PayLogDataExample example);

    int deleteByExample(PayLogDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PayLogData record);

    int insertSelective(PayLogData record);

    List<PayLogData> selectByExample(PayLogDataExample example);

    PayLogData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PayLogData record, @Param("example") PayLogDataExample example);

    int updateByExample(@Param("record") PayLogData record, @Param("example") PayLogDataExample example);

    int updateByPrimaryKeySelective(PayLogData record);

    int updateByPrimaryKey(PayLogData record);
}