package com.itmuch.cloud.study.account.controller;


import com.battcn.swagger.properties.ApiDataType;
import com.battcn.swagger.properties.ApiParamType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/rest/admin")
@Api(tags = "1.2", description = "管理员服务", value = "管理员服务")
@Slf4j
public class AdminController {



    @ApiOperation(value = "login",notes = "管理员后台登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username" ,value = "用户名称" ,dataType = ApiDataType.STRING ,paramType = ApiParamType.QUERY),
            @ApiImplicitParam(name = "password" ,value = "密码" ,dataType = ApiDataType.STRING ,paramType = ApiParamType.QUERY),
            @ApiImplicitParam(name = "verifyCode" ,value = "验证码" ,dataType = ApiDataType.STRING ,paramType = ApiParamType.QUERY)
    })
    @PostMapping("login")
    public String login(String username, String password, String verifyCode){
        log.info("管理员后台登陆 userName:{} password:{} verifyCode:{}", username, password, verifyCode);


        return generateAccessToken();
    }

    private String generateAccessToken() {
        return (UUID.randomUUID().toString().replace("-", ""));
    }
}
