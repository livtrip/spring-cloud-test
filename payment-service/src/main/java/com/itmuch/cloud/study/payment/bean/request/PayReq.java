package com.itmuch.cloud.study.payment.bean.request;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

/**
 * 〈一句话功能简述〉<br>
 * Description: 支付请求参数
 *
 * @author xierongli
 * @create 2019/9/10 10:19 上午
 */
@Data
public class PayReq {

    //类型 1：易  2：阿里云  3：腾讯云
    @Range(min=1, max=3, message = "类型错误")
    private Integer type;



}
