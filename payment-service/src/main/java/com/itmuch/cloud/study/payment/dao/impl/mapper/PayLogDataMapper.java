package com.itmuch.cloud.study.payment.dao.impl.mapper;

import com.itmuch.cloud.study.payment.entity.PayLogData;
import com.itmuch.cloud.study.payment.entity.PayLogDataExample;
import com.itmuch.cloud.study.payment.entity.PayLogDataWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayLogDataMapper {
    int countByExample(PayLogDataExample example);

    int deleteByExample(PayLogDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PayLogDataWithBLOBs record);

    int insertSelective(PayLogDataWithBLOBs record);

    List<PayLogDataWithBLOBs> selectByExampleWithBLOBs(PayLogDataExample example);

    List<PayLogData> selectByExample(PayLogDataExample example);

    PayLogDataWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PayLogDataWithBLOBs record, @Param("example") PayLogDataExample example);

    int updateByExampleWithBLOBs(@Param("record") PayLogDataWithBLOBs record, @Param("example") PayLogDataExample example);

    int updateByExample(@Param("record") PayLogData record, @Param("example") PayLogDataExample example);

    int updateByPrimaryKeySelective(PayLogDataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PayLogDataWithBLOBs record);

    int updateByPrimaryKey(PayLogData record);
}