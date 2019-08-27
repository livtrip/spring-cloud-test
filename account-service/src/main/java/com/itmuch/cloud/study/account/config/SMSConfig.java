package com.itmuch.cloud.study.account.config;


import com.itmuch.cloud.study.account.notify.AliyunSMSClient;
import com.itmuch.cloud.study.account.notify.QCloudSMSClient;
import com.itmuch.cloud.study.account.notify.SMSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rize on 2019/7/2.
 */
@Configuration
public class SMSConfig {

    @Value("${sms.enable}")
    private String enable;

    @Bean
    public SMSClient smsClient() {
        if ("qcloud".equals(enable)) {
            return new QCloudSMSClient();
        } else if ("aliyun".equals(enable)) {
            return new AliyunSMSClient();
        }
        return null;
    }
}
