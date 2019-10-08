package com.itmuch.cloud.study.payment.dao.impl;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import com.itmuch.cloud.study.payment.dao.PayNotifyAppLogDao;
import com.itmuch.cloud.study.payment.dao.impl.mapper.PayNotifyAppLogMapper;
import com.itmuch.cloud.study.payment.entity.PayNotifyAppLog;
import com.itmuch.cloud.study.payment.entity.PayNotifyAppLogExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PayNotifyAppLogDaoImpl implements PayNotifyAppLogDao {
    @Autowired
    private PayNotifyAppLogMapper payNotifyAppLogMapper;

    public int insert(PayNotifyAppLog record) {
        return this.payNotifyAppLogMapper.insert(record);
    }

    public int save(PayNotifyAppLog record) {
        return this.payNotifyAppLogMapper.insertSelective(record);
    }

    public int deleteByExample(PayNotifyAppLogExample example) {
        return this.payNotifyAppLogMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.payNotifyAppLogMapper.deleteByPrimaryKey(id);
    }

    public int updateById(PayNotifyAppLog record) {
        return this.payNotifyAppLogMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(PayNotifyAppLog record) {
        return this.payNotifyAppLogMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(PayNotifyAppLog record, PayNotifyAppLogExample example) {
        return this.payNotifyAppLogMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(PayNotifyAppLog record, PayNotifyAppLogExample example) {
        return this.payNotifyAppLogMapper.updateByExample(record, example);
    }

    public List<PayNotifyAppLog> listByExample(PayNotifyAppLogExample example) {
        return this.payNotifyAppLogMapper.selectByExample(example);
    }

    public PayNotifyAppLog getById(Long id) {
        return this.payNotifyAppLogMapper.selectByPrimaryKey(id);
    }

    public int countByExample(PayNotifyAppLogExample example) {
        return this.payNotifyAppLogMapper.countByExample(example);
    }

    public Page<PayNotifyAppLog> listForPage(int pageCurrent, int pageSize, PayNotifyAppLogExample example) {
        int count = this.payNotifyAppLogMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<PayNotifyAppLog>(count, totalPage, pageCurrent, pageSize, this.payNotifyAppLogMapper.selectByExample(example));
    }
}