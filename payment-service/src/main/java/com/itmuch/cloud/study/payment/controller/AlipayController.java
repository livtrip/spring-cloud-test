package com.itmuch.cloud.study.payment.controller;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import net.guerlab.sdk.alipay.controller.AlipayAbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈一句话功能简述〉<br>
 * Description:
 *
 * @author xierongli
 * @create 2019-10-06 23:36
 */
@RestController
@RequestMapping("/alipay/pay")
@Api(tags = "1.5", description = "银行卡服务", value = "银行卡服务")
@Slf4j
public class AlipayController extends AlipayAbstractController {

    @Autowired
    private AlipayClient client;//支付宝请求sdk客户端

    /**
     * 支付请求
     */
    @GetMapping("/app/{orderId}")
    public String app(@PathVariable Long orderId, HttpServletResponse httpResponse) throws AlipayApiException {

        JSONObject data = new JSONObject();
        data.put("out_trade_no", "201701010000001234"); //商户订单号
        data.put("product_code", "QUICK_MSECURITY_PAY"); //产品码, APP支付 QUICK_MSECURITY_PAY, PC支付 FAST_INSTANT_TRADE_PAY, 移动H5支付 QUICK_WAP_PAY
        data.put("total_amount", "0.01"); //订单金额
        data.put("subject", "测试订单"); //订单标题

        //APP支付
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        //PC支付
        //AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        //移动H5支付
        //AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();
        request.setNotifyUrl("http://demo/pay/alipay/notify/1"); //异步通知地址
        request.setBizContent(data.toJSONString()); //业务参数

        return client.sdkExecute(request).getBody();
    }

    @PostMapping("/notify/{orderId}")
    public String notify(@PathVariable Long orderId, HttpServletRequest request) {
        if (!notify0(request.getParameterMap())) {
            //这里处理验签失败
        }

        request.getParameter("trade_no");//获取请求参数中的商户订单号

        return "success";
    }
}
