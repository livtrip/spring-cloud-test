package com.itmuch.cloud.study.payment.dao.impl;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import com.itmuch.cloud.study.payment.dao.PayTransactionExtensionDao;
import com.itmuch.cloud.study.payment.dao.impl.mapper.PayTransactionExtensionMapper;
import com.itmuch.cloud.study.payment.entity.PayTransactionExtension;
import com.itmuch.cloud.study.payment.entity.PayTransactionExtensionExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PayTransactionExtensionDaoImpl implements PayTransactionExtensionDao {
    @Autowired
    private PayTransactionExtensionMapper payTransactionExtensionMapper;

    public int insert(PayTransactionExtension record) {
        return this.payTransactionExtensionMapper.insert(record);
    }

    public int save(PayTransactionExtension record) {
        return this.payTransactionExtensionMapper.insertSelective(record);
    }

    public int deleteByExample(PayTransactionExtensionExample example) {
        return this.payTransactionExtensionMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.payTransactionExtensionMapper.deleteByPrimaryKey(id);
    }

    public int updateById(PayTransactionExtension record) {
        return this.payTransactionExtensionMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(PayTransactionExtension record) {
        return this.payTransactionExtensionMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(PayTransactionExtension record, PayTransactionExtensionExample example) {
        return this.payTransactionExtensionMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(PayTransactionExtension record, PayTransactionExtensionExample example) {
        return this.payTransactionExtensionMapper.updateByExample(record, example);
    }

    public List<PayTransactionExtension> listByExample(PayTransactionExtensionExample example) {
        return this.payTransactionExtensionMapper.selectByExample(example);
    }

    public PayTransactionExtension getById(Long id) {
        return this.payTransactionExtensionMapper.selectByPrimaryKey(id);
    }

    public int countByExample(PayTransactionExtensionExample example) {
        return this.payTransactionExtensionMapper.countByExample(example);
    }

    public Page<PayTransactionExtension> listForPage(int pageCurrent, int pageSize, PayTransactionExtensionExample example) {
        int count = this.payTransactionExtensionMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<PayTransactionExtension>(count, totalPage, pageCurrent, pageSize, this.payTransactionExtensionMapper.selectByExample(example));
    }
}