package com.itmuch.cloud.study.coupon.dao.impl.mapper;

import com.itmuch.cloud.study.coupon.entity.CouponExchangeCodeDO;
import com.itmuch.cloud.study.coupon.entity.CouponExchangeCodeDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CouponExchangeCodeDOMapper {
    int countByExample(CouponExchangeCodeDOExample example);

    int deleteByExample(CouponExchangeCodeDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CouponExchangeCodeDO record);

    int insertSelective(CouponExchangeCodeDO record);

    List<CouponExchangeCodeDO> selectByExample(CouponExchangeCodeDOExample example);

    CouponExchangeCodeDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CouponExchangeCodeDO record, @Param("example") CouponExchangeCodeDOExample example);

    int updateByExample(@Param("record") CouponExchangeCodeDO record, @Param("example") CouponExchangeCodeDOExample example);

    int updateByPrimaryKeySelective(CouponExchangeCodeDO record);

    int updateByPrimaryKey(CouponExchangeCodeDO record);
}