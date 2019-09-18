package com.itmuch.cloud.study.payment.dao.impl;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import com.itmuch.cloud.study.payment.dao.PayTransactionDao;
import com.itmuch.cloud.study.payment.dao.impl.mapper.PayTransactionMapper;
import com.itmuch.cloud.study.payment.entity.PayTransaction;
import com.itmuch.cloud.study.payment.entity.PayTransactionExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PayTransactionDaoImpl implements PayTransactionDao {
    @Autowired
    private PayTransactionMapper payTransactionMapper;

    public int insert(PayTransaction record) {
        return this.payTransactionMapper.insert(record);
    }

    public int save(PayTransaction record) {
        return this.payTransactionMapper.insertSelective(record);
    }

    public int deleteByExample(PayTransactionExample example) {
        return this.payTransactionMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.payTransactionMapper.deleteByPrimaryKey(id);
    }

    public int updateById(PayTransaction record) {
        return this.payTransactionMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(PayTransaction record) {
        return this.payTransactionMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(PayTransaction record, PayTransactionExample example) {
        return this.payTransactionMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(PayTransaction record, PayTransactionExample example) {
        return this.payTransactionMapper.updateByExample(record, example);
    }

    public List<PayTransaction> listByExample(PayTransactionExample example) {
        return this.payTransactionMapper.selectByExample(example);
    }

    public PayTransaction getById(Long id) {
        return this.payTransactionMapper.selectByPrimaryKey(id);
    }

    public int countByExample(PayTransactionExample example) {
        return this.payTransactionMapper.countByExample(example);
    }

    public Page<PayTransaction> listForPage(int pageCurrent, int pageSize, PayTransactionExample example) {
        int count = this.payTransactionMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<PayTransaction>(count, totalPage, pageCurrent, pageSize, this.payTransactionMapper.selectByExample(example));
    }
}