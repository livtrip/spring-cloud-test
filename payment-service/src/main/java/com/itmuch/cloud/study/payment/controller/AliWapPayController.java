package com.itmuch.cloud.study.payment.controller;


import com.alibaba.fastjson.JSON;
import com.battcn.swagger.properties.ApiDataType;
import com.battcn.swagger.properties.ApiParamType;
import com.itmuch.cloud.study.payment.bean.request.AliWapPayReq;
import com.itmuch.cloud.study.payment.business.AliPayBO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


/**
 * 〈一句话功能简述〉<br>
 * Description: 支付宝
 * 文档中心
 * https://docs.open.alipay.com/203/106493
 *
 * @author xierongli
 * @create 2019-10-06 23:36
 */
@RestController
@RequestMapping("/alipay")
@Api(tags = "1.5", description = "支付宝手机网站支付", value = "支付宝-手机网站服务")
@Slf4j
public class AliWapPayController {

    @Autowired
    private AliPayBO aliPayBO;

    @ApiOperation(value = "/wap/wapPay", notes = "手机网站支付")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "subject", value = "商品标题", dataType = ApiDataType.STRING, paramType = ApiParamType.QUERY),
            @ApiImplicitParam(name = "body", value = "描述信息", dataType = ApiDataType.STRING, paramType = ApiParamType.QUERY),
            @ApiImplicitParam(name = "totalAmount", value = "支付金额", dataType = ApiDataType.STRING, paramType = ApiParamType.QUERY),
            @ApiImplicitParam(name = "notifyUrl", value = "通知回调地址", dataType = ApiDataType.STRING, paramType = ApiParamType.QUERY),
            @ApiImplicitParam(name = "returnUrl", value = "支付成功回调", dataType = ApiDataType.STRING, paramType = ApiParamType.QUERY),
            @ApiImplicitParam(name = "outTradeNo", value = "商家订单号", dataType = ApiDataType.STRING, paramType = ApiParamType.QUERY)
    })
    @PostMapping("/wap/pay")
    public void webPay(AliWapPayReq aliWapPayReq, HttpServletResponse response){


    }

    @ApiOperation(value = "/wap/notify", notes = "手机网站支付-异步通知")
    @GetMapping("/wap/notify")
    public void notify(HttpServletRequest request) {
        Map<String, String> params = aliPayBO.toMap(request);
        log.info("支付宝回调信息message[{}]", JSON.toJSONString(params));


    }


}
