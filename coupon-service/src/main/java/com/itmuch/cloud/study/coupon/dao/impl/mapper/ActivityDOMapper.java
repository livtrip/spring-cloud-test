package com.itmuch.cloud.study.coupon.dao.impl.mapper;

import com.itmuch.cloud.study.coupon.entity.ActivityDO;
import com.itmuch.cloud.study.coupon.entity.ActivityDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ActivityDOMapper {
    int countByExample(ActivityDOExample example);

    int deleteByExample(ActivityDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ActivityDO record);

    int insertSelective(ActivityDO record);

    List<ActivityDO> selectByExample(ActivityDOExample example);

    ActivityDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ActivityDO record, @Param("example") ActivityDOExample example);

    int updateByExample(@Param("record") ActivityDO record, @Param("example") ActivityDOExample example);

    int updateByPrimaryKeySelective(ActivityDO record);

    int updateByPrimaryKey(ActivityDO record);
}