package com.itmuch.cloud.study.payment.bean.response;

import lombok.Data;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * Description: 支付宝手机网站异步通知返回模型
 *
 * @author xierongli
 * @create 2019-10-08 17:28
 */
@Data
public class AliWapNotifyRes {

    //通知时间
    private Date  notify_time;
    //通知类型
    private String notify_type;
    //通知校验ID
    private String notify_id;
    //开发者的app_id
    private String app_id;

    //编码格式(utf-8、gbk、gb2312)
    private String charset;
    //接口版本
    private String version;
    //签名类型
    private String sign_type;
    //签名
    private String sign;

    //支付宝交易号
    private String trade_no;
    //商户订单号
    private String out_trade_no;
}
