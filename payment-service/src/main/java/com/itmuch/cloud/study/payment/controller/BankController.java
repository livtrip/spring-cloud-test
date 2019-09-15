package com.itmuch.cloud.study.payment.controller;

import com.battcn.swagger.properties.ApiDataType;
import com.battcn.swagger.properties.ApiParamType;
import com.itmuch.cloud.study.common.base.Result;
import com.itmuch.cloud.study.common.validator.ValidatorUtils;
import com.itmuch.cloud.study.payment.bean.request.CardBinReq;
import com.itmuch.cloud.study.payment.bean.response.CardBinRes;
import com.itmuch.cloud.study.payment.business.BankCardBO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * Description:易宝银行卡控制器
 *
 * @author xierongli
 * @create 2019-09-14 11:47
 */
@RestController
@RequestMapping("/pay/bankCard")
@Api(tags = "1.4", description = "银行卡服务", value = "银行卡服务")
@Slf4j
public class BankController {


    @Autowired
    private BankCardBO bankCardBO;


    @ApiOperation(value = "checkBankBin", notes = "查询卡bin")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户ID", dataType = ApiDataType.LONG, paramType = ApiParamType.QUERY),
            @ApiImplicitParam(name = "bankNo", value = "银行卡号", dataType = ApiDataType.STRING, paramType = ApiParamType.QUERY)
    })
    @GetMapping("checkBankBin")
    public Result<CardBinRes> checkBankBin(CardBinReq cardBinReq){
        ValidatorUtils.validateEntity(cardBinReq);
        return bankCardBO.checkBankBin(cardBinReq);
    }


}
