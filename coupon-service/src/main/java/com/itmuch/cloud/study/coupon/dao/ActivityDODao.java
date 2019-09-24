package com.itmuch.cloud.study.coupon.dao;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.coupon.entity.ActivityDO;
import com.itmuch.cloud.study.coupon.entity.ActivityDOExample;

public interface ActivityDODao {
    int save(ActivityDO record);

    int deleteById(Long id);

    int updateById(ActivityDO record);

    ActivityDO getById(Long id);

    Page<ActivityDO> listForPage(int pageCurrent, int pageSize, ActivityDOExample example);
}