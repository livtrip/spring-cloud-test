package com.itmuch.cloud.study.payment.dao;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.payment.entity.PayTransactionExtension;
import com.itmuch.cloud.study.payment.entity.PayTransactionExtensionExample;
import java.util.List;

public interface PayTransactionExtensionDao {
    int insert(PayTransactionExtension record);

    int save(PayTransactionExtension record);

    int deleteByExample(PayTransactionExtensionExample example);

    int deleteById(Long id);

    int updateById(PayTransactionExtension record);

    int updateByPrimaryKey(PayTransactionExtension record);

    int updateByExampleSelective(PayTransactionExtension record, PayTransactionExtensionExample example);

    int updateByExample(PayTransactionExtension record, PayTransactionExtensionExample example);

    PayTransactionExtension getById(Long id);

    List<PayTransactionExtension> listByExample(PayTransactionExtensionExample example);

    int countByExample(PayTransactionExtensionExample example);

    Page<PayTransactionExtension> listForPage(int pageCurrent, int pageSize, PayTransactionExtensionExample example);
}