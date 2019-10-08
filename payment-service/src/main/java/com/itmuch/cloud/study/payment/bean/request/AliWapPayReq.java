package com.itmuch.cloud.study.payment.bean.request;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 〈一句话功能简述〉<br>
 * Description: 支付宝手机支付请求入参
 *
 * @author xierongli
 * @create 2019-10-08 16:44
 */
@Data
public class AliWapPayReq {

    //主题:商品的标题/交易标题/订单标题/订单关键字等。
    @NotBlank(message = "商品标题不能为空")
    private String subject;
    //内容:对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。
    @NotBlank(message = "商品描述不能为空")
    private String body;
    //金额
    @NotBlank(message = "订单金额不能为空")
    private String totalAmount;
    //通知回调
    private String notifyUrl;
    //成功回调
    private String returnUrl;

    private String  passBackParams;
    //商户网站唯一订单号
    @NotBlank(message = "商家订单号不能为空")
    private String outTradeNo;
    //销售产品码，商家和支付宝签约的产品码。该产品请填写固定值：QUICK_WAP_WAY
    private String productCode = "QUICK_WAP_WAY";




}
