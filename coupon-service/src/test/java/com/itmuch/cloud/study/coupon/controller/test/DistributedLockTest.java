package com.itmuch.cloud.study.coupon.controller.test;

import com.itmuch.cloud.study.coupon.controller.DistributeLockController;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DistributedLockTest {
    @Autowired
    private DistributeLockController distributeLockController;


}
