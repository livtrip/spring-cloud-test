package com.itmuch.cloud.study.account.dao;

import com.itmuch.cloud.study.account.entity.RoleInfo;
import com.itmuch.cloud.study.account.entity.RoleInfoExample;
import com.itmuch.cloud.study.common.util.Page;
import java.util.List;

public interface RoleInfoDao {
    int insert(RoleInfo record);

    int save(RoleInfo record);

    int deleteByExample(RoleInfoExample example);

    int deleteById(Long id);

    int updateById(RoleInfo record);

    int updateByPrimaryKey(RoleInfo record);

    int updateByExampleSelective(RoleInfo record, RoleInfoExample example);

    int updateByExample(RoleInfo record, RoleInfoExample example);

    RoleInfo getById(Long id);

    List<RoleInfo> listByExample(RoleInfoExample example);

    int countByExample(RoleInfoExample example);

    Page<RoleInfo> listForPage(int pageCurrent, int pageSize, RoleInfoExample example);
}