package com.itmuch.cloud.study.payment.dao;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.payment.entity.CheckOutRecord;
import com.itmuch.cloud.study.payment.entity.CheckOutRecordExample;
import java.util.List;

public interface CheckOutRecordDao {
    int insert(CheckOutRecord record);

    int save(CheckOutRecord record);

    int deleteByExample(CheckOutRecordExample example);

    int deleteById(Long id);

    int updateById(CheckOutRecord record);

    int updateByPrimaryKey(CheckOutRecord record);

    int updateByExampleSelective(CheckOutRecord record, CheckOutRecordExample example);

    int updateByExample(CheckOutRecord record, CheckOutRecordExample example);

    CheckOutRecord getById(Long id);

    List<CheckOutRecord> listByExample(CheckOutRecordExample example);

    int countByExample(CheckOutRecordExample example);

    Page<CheckOutRecord> listForPage(int pageCurrent, int pageSize, CheckOutRecordExample example);
}