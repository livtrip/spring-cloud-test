package com.itmuch.cloud.study.payment.dao;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.payment.entity.PayNotifyAppLog;
import com.itmuch.cloud.study.payment.entity.PayNotifyAppLogExample;
import java.util.List;

public interface PayNotifyAppLogDao {
    int insert(PayNotifyAppLog record);

    int save(PayNotifyAppLog record);

    int deleteByExample(PayNotifyAppLogExample example);

    int deleteById(Long id);

    int updateById(PayNotifyAppLog record);

    int updateByPrimaryKey(PayNotifyAppLog record);

    int updateByExampleSelective(PayNotifyAppLog record, PayNotifyAppLogExample example);

    int updateByExample(PayNotifyAppLog record, PayNotifyAppLogExample example);

    PayNotifyAppLog getById(Long id);

    List<PayNotifyAppLog> listByExample(PayNotifyAppLogExample example);

    int countByExample(PayNotifyAppLogExample example);

    Page<PayNotifyAppLog> listForPage(int pageCurrent, int pageSize, PayNotifyAppLogExample example);
}