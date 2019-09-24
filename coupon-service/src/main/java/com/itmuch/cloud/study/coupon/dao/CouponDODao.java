package com.itmuch.cloud.study.coupon.dao;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.coupon.entity.CouponDO;
import com.itmuch.cloud.study.coupon.entity.CouponDOExample;

public interface CouponDODao {
    int save(CouponDO record);

    int deleteById(Long id);

    int updateById(CouponDO record);

    CouponDO getById(Long id);

    Page<CouponDO> listForPage(int pageCurrent, int pageSize, CouponDOExample example);
}