package com.itmuch.cloud.study.payment.dao;

import com.itmuch.cloud.study.common.util.Page.Page;
import com.itmuch.cloud.study.payment.entity.PayLogData;
import com.itmuch.cloud.study.payment.entity.PayLogDataExample;
import java.util.List;

public interface PayLogDataDao {
    int insert(PayLogData record);

    int save(PayLogData record);

    int deleteByExample(PayLogDataExample example);

    int deleteById(Long id);

    int updateById(PayLogData record);

    int updateByPrimaryKey(PayLogData record);

    int updateByExampleSelective(PayLogData record, PayLogDataExample example);

    int updateByExample(PayLogData record, PayLogDataExample example);

    PayLogData getById(Long id);

    List<PayLogData> listByExample(PayLogDataExample example);

    int countByExample(PayLogDataExample example);

    Page<PayLogData> listForPage(int pageCurrent, int pageSize, PayLogDataExample example);
}