package com.itmuch.cloud.study.coupon.dao.impl;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import com.itmuch.cloud.study.coupon.dao.CouponExchangeCodeDODao;
import com.itmuch.cloud.study.coupon.dao.impl.mapper.CouponExchangeCodeDOMapper;
import com.itmuch.cloud.study.coupon.entity.CouponExchangeCodeDO;
import com.itmuch.cloud.study.coupon.entity.CouponExchangeCodeDOExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CouponExchangeCodeDODaoImpl implements CouponExchangeCodeDODao {
    @Autowired
    private CouponExchangeCodeDOMapper couponExchangeCodeDOMapper;

    public int save(CouponExchangeCodeDO record) {
        return this.couponExchangeCodeDOMapper.insertSelective(record);
    }

    public int deleteById(Long id) {
        return this.couponExchangeCodeDOMapper.deleteByPrimaryKey(id);
    }

    public int updateById(CouponExchangeCodeDO record) {
        return this.couponExchangeCodeDOMapper.updateByPrimaryKeySelective(record);
    }

    public CouponExchangeCodeDO getById(Long id) {
        return this.couponExchangeCodeDOMapper.selectByPrimaryKey(id);
    }

    public Page<CouponExchangeCodeDO> listForPage(int pageCurrent, int pageSize, CouponExchangeCodeDOExample example) {
        int count = this.couponExchangeCodeDOMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<CouponExchangeCodeDO>(count, totalPage, pageCurrent, pageSize, this.couponExchangeCodeDOMapper.selectByExample(example));
    }
}