package com.itmuch.cloud.study.account.controller;



import com.battcn.swagger.properties.ApiDataType;
import com.battcn.swagger.properties.ApiParamType;
import com.itmuch.cloud.study.account.bean.dto.UserDTO;

import com.itmuch.cloud.study.account.service.UserService;
import com.itmuch.cloud.study.common.base.Result;
import com.itmuch.cloud.study.common.base.Results;
import com.itmuch.cloud.study.common.validator.Assert;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/user")
@Api(description = "用户服务", value = "用户服务")
@Slf4j
public class UserController {


    @Autowired
    private UserService userService;


    @ApiOperation(value = "/wechatLogin",notes = "微信授权登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "loginType" ,value = "登陆类型" ,dataType = ApiDataType.INT ,paramType = ApiParamType.QUERY),
            @ApiImplicitParam(name = "ip" ,value = "IP" ,dataType = ApiDataType.STRING ,paramType = ApiParamType.QUERY),
            @ApiImplicitParam(name = "raw" ,value = "第三方平台返回的数据" ,dataType = ApiDataType.STRING ,paramType = ApiParamType.QUERY)
    })
    @GetMapping("wechatLogin")
    public Result<UserDTO> wechatLogin(Integer loginType, String ip, String raw){
        Assert.isNull(loginType,"用户Id不能为空");
        Assert.isBlank(ip, "IP不能为空");
        Assert.isBlank(raw, "第三方平台返回的数据不能为空");
        UserDTO userDTO = userService.wechatLogin(loginType, ip, raw);
        return Results.newSuccessResult(userDTO);
    }





}
