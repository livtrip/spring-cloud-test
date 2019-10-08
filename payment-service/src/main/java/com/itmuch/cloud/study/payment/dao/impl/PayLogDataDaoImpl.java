package com.itmuch.cloud.study.payment.dao.impl;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import com.itmuch.cloud.study.payment.dao.PayLogDataDao;
import com.itmuch.cloud.study.payment.dao.impl.mapper.PayLogDataMapper;
import com.itmuch.cloud.study.payment.entity.PayLogData;
import com.itmuch.cloud.study.payment.entity.PayLogDataExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PayLogDataDaoImpl implements PayLogDataDao {
    @Autowired
    private PayLogDataMapper payLogDataMapper;

    public int insert(PayLogData record) {
        return this.payLogDataMapper.insert(record);
    }

    public int save(PayLogData record) {
        return this.payLogDataMapper.insertSelective(record);
    }

    public int deleteByExample(PayLogDataExample example) {
        return this.payLogDataMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.payLogDataMapper.deleteByPrimaryKey(id);
    }

    public int updateById(PayLogData record) {
        return this.payLogDataMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(PayLogData record) {
        return this.payLogDataMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(PayLogData record, PayLogDataExample example) {
        return this.payLogDataMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(PayLogData record, PayLogDataExample example) {
        return this.payLogDataMapper.updateByExample(record, example);
    }

    public List<PayLogData> listByExample(PayLogDataExample example) {
        return this.payLogDataMapper.selectByExample(example);
    }

    public PayLogData getById(Long id) {
        return this.payLogDataMapper.selectByPrimaryKey(id);
    }

    public int countByExample(PayLogDataExample example) {
        return this.payLogDataMapper.countByExample(example);
    }

    public Page<PayLogData> listForPage(int pageCurrent, int pageSize, PayLogDataExample example) {
        int count = this.payLogDataMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<PayLogData>(count, totalPage, pageCurrent, pageSize, this.payLogDataMapper.selectByExample(example));
    }
}