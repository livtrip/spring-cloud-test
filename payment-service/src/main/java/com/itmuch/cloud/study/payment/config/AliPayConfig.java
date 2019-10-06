package com.itmuch.cloud.study.payment.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * Description: 支付宝配置
 *
 * @author xierongli
 * @create 2019-10-06 23:30
 */
@Component
@ConfigurationProperties(prefix = "alipay")
@Data
public class AliPayConfig {

    private String appId;

    private String privateKey;

    private String publicKey;

    private String notifyDomain;


    private String serverUrl;

}
