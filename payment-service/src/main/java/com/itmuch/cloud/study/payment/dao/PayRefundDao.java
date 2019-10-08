package com.itmuch.cloud.study.payment.dao;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.payment.entity.PayRefund;
import com.itmuch.cloud.study.payment.entity.PayRefundExample;
import java.util.List;

public interface PayRefundDao {
    int insert(PayRefund record);

    int save(PayRefund record);

    int deleteByExample(PayRefundExample example);

    int deleteById(Long id);

    int updateById(PayRefund record);

    int updateByPrimaryKey(PayRefund record);

    int updateByExampleSelective(PayRefund record, PayRefundExample example);

    int updateByExample(PayRefund record, PayRefundExample example);

    PayRefund getById(Long id);

    List<PayRefund> listByExample(PayRefundExample example);

    int countByExample(PayRefundExample example);

    Page<PayRefund> listForPage(int pageCurrent, int pageSize, PayRefundExample example);
}