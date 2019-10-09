package com.itmuch.cloud.study.payment.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@Api(tags = "1.2", description = "健康服务", value = "健康服务")
public class HealthController {

    @GetMapping("/test")
    public String health(){
        System.out.println("come here......");
        return "ok";
    }
}
