package com.itmuch.cloud.study.coupon.dao.impl;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import com.itmuch.cloud.study.coupon.dao.CouponDODao;
import com.itmuch.cloud.study.coupon.dao.impl.mapper.CouponDOMapper;
import com.itmuch.cloud.study.coupon.entity.CouponDO;
import com.itmuch.cloud.study.coupon.entity.CouponDOExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CouponDODaoImpl implements CouponDODao {
    @Autowired
    private CouponDOMapper couponDOMapper;

    public int save(CouponDO record) {
        return this.couponDOMapper.insertSelective(record);
    }

    public int deleteById(Long id) {
        return this.couponDOMapper.deleteByPrimaryKey(id);
    }

    public int updateById(CouponDO record) {
        return this.couponDOMapper.updateByPrimaryKeySelective(record);
    }

    public CouponDO getById(Long id) {
        return this.couponDOMapper.selectByPrimaryKey(id);
    }

    public Page<CouponDO> listForPage(int pageCurrent, int pageSize, CouponDOExample example) {
        int count = this.couponDOMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<CouponDO>(count, totalPage, pageCurrent, pageSize, this.couponDOMapper.selectByExample(example));
    }
}