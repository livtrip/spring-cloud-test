package com.itmuch.cloud.study.payment.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * Description: 易宝配置参数
 *
 * @author xierongli
 * @create 2019-09-14 21:26
 */
@Component
@ConfigurationProperties(prefix = "yeepay")
public class YeePayConfig {

    private String serverRoot;

    private String payAppKey;

    private String appKey;

    private String merchantNo;

    private String quick;

    private String withhold;

    private String yeepaCallbackUrl;

    private String yeepayCallbackUrlV2;

    private String yeepayWithholdCallback;
    
    
    // 出款记录
    private String  transferSendUri;
    // 统一鉴权绑卡请求
    private String  authBindCard_reqUri;
     // 鉴权绑卡确认
     private String  authBindCardConfirmUri;
    // 鉴权绑卡重发
    private String  authBindCard_resendUri;
    // 鉴权记录查询
    private String  authBindCard_queryUri;
    
    
     // 解绑银行卡
    private String unbindUri;
    // 支付对账文件下载
    private String  tempCardPay;
    // 卡 bin查询
    private String  bankCardQueryUri;
    // 解绑请求
    private String  paperOrderUnbindUri;
    // 统一首次支付请求
    private String   unionFirstPayUri;
    // 首次支付短验确认
    private String  firstPaySmsConfUri;
    // 首次支付短验重发
    private String   firstPaySmsResendUri;
    
    
    // 统一绑卡支付请求
    private String bindCardPayUri;
    // 绑卡支付确认
    private String bindCardConfirmUri;
    // 绑卡支付重发
    private String bindCardPayResendUri;
    // 绑卡支付查询
    private String bindCardPayQueryUri;

    private String queryCustomerAmountUri;
    // 无感知签约
    private String authNonperceivedUri;
    // 查询地址
    private String paymentQueryUri;
    // 线下充值
    private String offlineRecharge;
    // 充值回调
    private String rechargeCallback;



}
