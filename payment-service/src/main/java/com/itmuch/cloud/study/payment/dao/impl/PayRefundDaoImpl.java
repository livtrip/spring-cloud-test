package com.itmuch.cloud.study.payment.dao.impl;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import com.itmuch.cloud.study.payment.dao.PayRefundDao;
import com.itmuch.cloud.study.payment.dao.impl.mapper.PayRefundMapper;
import com.itmuch.cloud.study.payment.entity.PayRefund;
import com.itmuch.cloud.study.payment.entity.PayRefundExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PayRefundDaoImpl implements PayRefundDao {
    @Autowired
    private PayRefundMapper payRefundMapper;

    public int insert(PayRefund record) {
        return this.payRefundMapper.insert(record);
    }

    public int save(PayRefund record) {
        return this.payRefundMapper.insertSelective(record);
    }

    public int deleteByExample(PayRefundExample example) {
        return this.payRefundMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.payRefundMapper.deleteByPrimaryKey(id);
    }

    public int updateById(PayRefund record) {
        return this.payRefundMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(PayRefund record) {
        return this.payRefundMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(PayRefund record, PayRefundExample example) {
        return this.payRefundMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(PayRefund record, PayRefundExample example) {
        return this.payRefundMapper.updateByExample(record, example);
    }

    public List<PayRefund> listByExample(PayRefundExample example) {
        return this.payRefundMapper.selectByExample(example);
    }

    public PayRefund getById(Long id) {
        return this.payRefundMapper.selectByPrimaryKey(id);
    }

    public int countByExample(PayRefundExample example) {
        return this.payRefundMapper.countByExample(example);
    }

    public Page<PayRefund> listForPage(int pageCurrent, int pageSize, PayRefundExample example) {
        int count = this.payRefundMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<PayRefund>(count, totalPage, pageCurrent, pageSize, this.payRefundMapper.selectByExample(example));
    }
}