package com.itmuch.cloud.study.payment.dao.impl.mapper;

import com.itmuch.cloud.study.payment.entity.PayNotifyAppLog;
import com.itmuch.cloud.study.payment.entity.PayNotifyAppLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayNotifyAppLogMapper {
    int countByExample(PayNotifyAppLogExample example);

    int deleteByExample(PayNotifyAppLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PayNotifyAppLog record);

    int insertSelective(PayNotifyAppLog record);

    List<PayNotifyAppLog> selectByExample(PayNotifyAppLogExample example);

    PayNotifyAppLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PayNotifyAppLog record, @Param("example") PayNotifyAppLogExample example);

    int updateByExample(@Param("record") PayNotifyAppLog record, @Param("example") PayNotifyAppLogExample example);

    int updateByPrimaryKeySelective(PayNotifyAppLog record);

    int updateByPrimaryKey(PayNotifyAppLog record);
}