package com.itmuch.cloud.study.account.controller;

import com.battcn.swagger.properties.ApiDataType;
import com.battcn.swagger.properties.ApiParamType;
import com.itmuch.cloud.study.account.bean.qo.UserQO;
import com.itmuch.cloud.study.account.bean.request.IdCardBase64ImgReq;
import com.itmuch.cloud.study.account.bean.response.IdCardOcrRes;
import com.itmuch.cloud.study.account.service.IdentityService;
import com.itmuch.cloud.study.account.service.UserService;
import com.itmuch.cloud.study.common.base.Result;
import com.itmuch.cloud.study.common.base.Results;
import com.itmuch.cloud.study.common.validator.Assert;
import com.itmuch.cloud.study.common.validator.ValidatorUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * Description:
 *
 * @author xierongli
 * @create 2019-08-27 22:16
 */
@RestController
@RequestMapping("/rest/identity")
@Api(tags = "1.2", description = "身份认证服务", value = "身份认证服务")
@Slf4j
public class IdentityController {

    @Autowired
    private IdentityService identityService;

    @Autowired
    private UserService userService;


    @ApiOperation(value = "/idCardOcr",notes = "身份证识别")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "idcardBase64Img" ,value = "身份证识别参数" ,dataType = ApiDataType.INT ,paramType = ApiParamType.QUERY)
    })
    @PostMapping("idCardOcr")
    public Result<IdCardOcrRes> idCardOcr(@RequestBody IdCardBase64ImgReq idcardBase64Img){
        ValidatorUtils.validateEntity(idcardBase64Img);
        Assert.isTrue(userService.countByCondition(UserQO.builder().id(idcardBase64Img.getUserId()).build()) == 0, "用户不存在");
        identityService.idCardOcr(idcardBase64Img.getIdcardBase64Img());

        return Results.newSuccessResult(null);
    }


}
