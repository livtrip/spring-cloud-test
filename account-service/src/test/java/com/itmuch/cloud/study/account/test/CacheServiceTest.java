package com.itmuch.cloud.study.account.test;

import com.itmuch.cloud.study.account.AccountApplication;
import com.itmuch.cloud.study.account.service.CacheService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br>
 * Description: redis缓存测试类
 *
 * @author xierongli
 * @create 2019-08-24 18:09
 */
@RunWith(SpringRunner.class)
//@SpringBootTest(classes = AccountApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
@SpringBootTest
public class CacheServiceTest {


    @Autowired
    private CacheService cacheService;

    @Resource
    private StringRedisTemplate stringRedisTemplate;


    @Test
    public void test(){
        stringRedisTemplate.opsForValue().set("mm","2343242");
        System.out.println(stringRedisTemplate.opsForValue().get("mm"));

    }
}
