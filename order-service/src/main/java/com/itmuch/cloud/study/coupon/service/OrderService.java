package com.itmuch.cloud.study.coupon.service;

import com.itmuch.cloud.study.coupon.entity.OrderInfo;

public interface OrderService {

    void createOrder(Long userId, Long commodityId, Integer purchaseCount);

    OrderInfo getById(Long id);

    int  updateById(OrderInfo orderInfo);
}
