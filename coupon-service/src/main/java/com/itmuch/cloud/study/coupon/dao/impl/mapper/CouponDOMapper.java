package com.itmuch.cloud.study.coupon.dao.impl.mapper;

import com.itmuch.cloud.study.coupon.entity.CouponDO;
import com.itmuch.cloud.study.coupon.entity.CouponDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CouponDOMapper {
    int countByExample(CouponDOExample example);

    int deleteByExample(CouponDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CouponDO record);

    int insertSelective(CouponDO record);

    List<CouponDO> selectByExample(CouponDOExample example);

    CouponDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CouponDO record, @Param("example") CouponDOExample example);

    int updateByExample(@Param("record") CouponDO record, @Param("example") CouponDOExample example);

    int updateByPrimaryKeySelective(CouponDO record);

    int updateByPrimaryKey(CouponDO record);
}