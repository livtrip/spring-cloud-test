package com.itmuch.cloud.study.payment.dao;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.payment.entity.PayTransaction;
import com.itmuch.cloud.study.payment.entity.PayTransactionExample;
import java.util.List;

public interface PayTransactionDao {
    int insert(PayTransaction record);

    int save(PayTransaction record);

    int deleteByExample(PayTransactionExample example);

    int deleteById(Long id);

    int updateById(PayTransaction record);

    int updateByPrimaryKey(PayTransaction record);

    int updateByExampleSelective(PayTransaction record, PayTransactionExample example);

    int updateByExample(PayTransaction record, PayTransactionExample example);

    PayTransaction getById(Long id);

    List<PayTransaction> listByExample(PayTransactionExample example);

    int countByExample(PayTransactionExample example);

    Page<PayTransaction> listForPage(int pageCurrent, int pageSize, PayTransactionExample example);
}