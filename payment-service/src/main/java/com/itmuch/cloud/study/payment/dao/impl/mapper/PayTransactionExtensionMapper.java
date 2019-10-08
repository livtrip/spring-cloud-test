package com.itmuch.cloud.study.payment.dao.impl.mapper;

import com.itmuch.cloud.study.payment.entity.PayTransactionExtension;
import com.itmuch.cloud.study.payment.entity.PayTransactionExtensionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayTransactionExtensionMapper {
    int countByExample(PayTransactionExtensionExample example);

    int deleteByExample(PayTransactionExtensionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PayTransactionExtension record);

    int insertSelective(PayTransactionExtension record);

    List<PayTransactionExtension> selectByExampleWithBLOBs(PayTransactionExtensionExample example);

    List<PayTransactionExtension> selectByExample(PayTransactionExtensionExample example);

    PayTransactionExtension selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PayTransactionExtension record, @Param("example") PayTransactionExtensionExample example);

    int updateByExampleWithBLOBs(@Param("record") PayTransactionExtension record, @Param("example") PayTransactionExtensionExample example);

    int updateByExample(@Param("record") PayTransactionExtension record, @Param("example") PayTransactionExtensionExample example);

    int updateByPrimaryKeySelective(PayTransactionExtension record);

    int updateByPrimaryKeyWithBLOBs(PayTransactionExtension record);

    int updateByPrimaryKey(PayTransactionExtension record);
}