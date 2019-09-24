package com.itmuch.cloud.study.coupon.dao.impl;

import com.itmuch.cloud.study.common.util.Page;
import com.itmuch.cloud.study.common.util.PageUtil;
import com.itmuch.cloud.study.coupon.dao.ActivityDODao;
import com.itmuch.cloud.study.coupon.dao.impl.mapper.ActivityDOMapper;
import com.itmuch.cloud.study.coupon.entity.ActivityDO;
import com.itmuch.cloud.study.coupon.entity.ActivityDOExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ActivityDODaoImpl implements ActivityDODao {
    @Autowired
    private ActivityDOMapper activityDOMapper;

    public int save(ActivityDO record) {
        return this.activityDOMapper.insertSelective(record);
    }

    public int deleteById(Long id) {
        return this.activityDOMapper.deleteByPrimaryKey(id);
    }

    public int updateById(ActivityDO record) {
        return this.activityDOMapper.updateByPrimaryKeySelective(record);
    }

    public ActivityDO getById(Long id) {
        return this.activityDOMapper.selectByPrimaryKey(id);
    }

    public Page<ActivityDO> listForPage(int pageCurrent, int pageSize, ActivityDOExample example) {
        int count = this.activityDOMapper.countByExample(example);
        pageSize = PageUtil.checkPageSize(pageSize);
        pageCurrent = PageUtil.checkPageCurrent(count, pageSize, pageCurrent);
        int totalPage = PageUtil.countTotalPage(count, pageSize);
        example.setLimitStart(PageUtil.countOffset(pageCurrent, pageSize));
        example.setPageSize(pageSize);
        return new Page<ActivityDO>(count, totalPage, pageCurrent, pageSize, this.activityDOMapper.selectByExample(example));
    }
}