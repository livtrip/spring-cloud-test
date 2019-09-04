package com.itmuch.cloud.study.payment.dao.impl;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import com.itmuch.cloud.study.payment.dao.CheckOutRecordDao;
import com.itmuch.cloud.study.payment.dao.impl.mapper.CheckOutRecordMapper;
import com.itmuch.cloud.study.payment.entity.CheckOutRecord;
import com.itmuch.cloud.study.payment.entity.CheckOutRecordExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CheckOutRecordDaoImpl implements CheckOutRecordDao {
    @Autowired
    private CheckOutRecordMapper checkOutRecordMapper;

    public int insert(CheckOutRecord record) {
        return this.checkOutRecordMapper.insert(record);
    }

    public int save(CheckOutRecord record) {
        return this.checkOutRecordMapper.insertSelective(record);
    }

    public int deleteByExample(CheckOutRecordExample example) {
        return this.checkOutRecordMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.checkOutRecordMapper.deleteByPrimaryKey(id);
    }

    public int updateById(CheckOutRecord record) {
        return this.checkOutRecordMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(CheckOutRecord record) {
        return this.checkOutRecordMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(CheckOutRecord record, CheckOutRecordExample example) {
        return this.checkOutRecordMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(CheckOutRecord record, CheckOutRecordExample example) {
        return this.checkOutRecordMapper.updateByExample(record, example);
    }

    public List<CheckOutRecord> listByExample(CheckOutRecordExample example) {
        return this.checkOutRecordMapper.selectByExample(example);
    }

    public CheckOutRecord getById(Long id) {
        return this.checkOutRecordMapper.selectByPrimaryKey(id);
    }

    public int countByExample(CheckOutRecordExample example) {
        return this.checkOutRecordMapper.countByExample(example);
    }

    public Page<CheckOutRecord> listForPage(int pageCurrent, int pageSize, CheckOutRecordExample example) {
        int count = this.checkOutRecordMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<CheckOutRecord>(count, totalPage, pageCurrent, pageSize, this.checkOutRecordMapper.selectByExample(example));
    }
}