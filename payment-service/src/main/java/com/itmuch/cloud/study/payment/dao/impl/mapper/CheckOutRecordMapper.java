package com.itmuch.cloud.study.payment.dao.impl.mapper;

import com.itmuch.cloud.study.payment.entity.CheckOutRecord;
import com.itmuch.cloud.study.payment.entity.CheckOutRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CheckOutRecordMapper {
    int countByExample(CheckOutRecordExample example);

    int deleteByExample(CheckOutRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CheckOutRecord record);

    int insertSelective(CheckOutRecord record);

    List<CheckOutRecord> selectByExample(CheckOutRecordExample example);

    CheckOutRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CheckOutRecord record, @Param("example") CheckOutRecordExample example);

    int updateByExample(@Param("record") CheckOutRecord record, @Param("example") CheckOutRecordExample example);

    int updateByPrimaryKeySelective(CheckOutRecord record);

    int updateByPrimaryKey(CheckOutRecord record);
}