package com.itmuch.cloud.study.payment.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.itmuch.cloud.study.payment.business.AliPayBO;
import com.itmuch.cloud.study.payment.properties.AliPayProperties;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * Description: 支付宝电脑网站支付业务逻辑
 * 文档中心 https://docs.open.alipay.com/204
 *
 * @author xierongli
 * @create 2019-10-09 13:51
 */
@RestController
@RequestMapping("/alipay")
@Api(tags = "1.6", description = "支付宝电脑网站", value = "支付宝-电脑网站支付服务")
@Slf4j
public class AliWebPayController {


    public final static String CHARSET = "UTF-8";
    public final static String SIGN_TYPE ="rsa";
    @Autowired
    private AliPayBO aliPayBO;
    @Autowired
    private AliPayProperties aliPayProperties;






    @GetMapping("notify")
    public void notify(HttpServletRequest request) throws AlipayApiException {
        //将异步通知中收到的所有参数都存放到 map 中
        Map<String, String> paramsMap =  aliPayBO.toMap(request);
        //调用SDK验证签名
        boolean signVerified = AlipaySignature.rsaCheckV1(paramsMap, aliPayProperties.getPublicKey(), CHARSET, SIGN_TYPE);
        if(signVerified){
            // TODO 验签成功后，按照支付结果异步通知中的描述，对支付结果中的业务内容进行二次校验，校验成功后在response中返回success并继续商户自身业务处理，校验失败返回failure
        }else{
            // TODO 验签失败则记录异常日志，并在response中返回failure.
        }
    }

}
