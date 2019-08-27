package com.itmuch.cloud.study.account.dao;

import com.itmuch.cloud.study.account.entity.AdminInfo;
import com.itmuch.cloud.study.account.entity.AdminInfoExample;
import com.itmuch.cloud.study.common.util.Page;
import java.util.List;

public interface AdminInfoDao {
    int insert(AdminInfo record);

    int save(AdminInfo record);

    int deleteByExample(AdminInfoExample example);

    int deleteById(Long id);

    int updateById(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);

    int updateByExampleSelective(AdminInfo record, AdminInfoExample example);

    int updateByExample(AdminInfo record, AdminInfoExample example);

    AdminInfo getById(Long id);

    List<AdminInfo> listByExample(AdminInfoExample example);

    int countByExample(AdminInfoExample example);

    Page<AdminInfo> listForPage(int pageCurrent, int pageSize, AdminInfoExample example);
}