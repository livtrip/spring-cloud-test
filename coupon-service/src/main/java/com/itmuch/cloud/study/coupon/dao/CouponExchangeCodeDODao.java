package com.itmuch.cloud.study.coupon.dao;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.coupon.entity.CouponExchangeCodeDO;
import com.itmuch.cloud.study.coupon.entity.CouponExchangeCodeDOExample;

public interface CouponExchangeCodeDODao {
    int save(CouponExchangeCodeDO record);

    int deleteById(Long id);

    int updateById(CouponExchangeCodeDO record);

    CouponExchangeCodeDO getById(Long id);

    Page<CouponExchangeCodeDO> listForPage(int pageCurrent, int pageSize, CouponExchangeCodeDOExample example);
}