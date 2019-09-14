package com.itmuch.cloud.study.payment.proxy;

import com.itmuch.cloud.study.payment.bean.request.PayReq;
import com.itmuch.cloud.study.payment.bean.response.PayRes;
import com.itmuch.cloud.study.payment.entity.PayLogData;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * Description: 易宝支付业务
 *
 * @author xierongli
 * @create 2019/9/9 11:28 上午
 */
@Service
public class YeepayProxy extends  BaseProxy implements PayProxy {

    @Override
    public PayLogData buildPayLogData(PayReq payReq) {
        PayLogData payLogData = new PayLogData();
        payLogData.setAppOrderId(payReq.getOrderId());
        return payLogData;
    }

    @Override
    public PayRes pay(PayReq payReq) {
        insertPayLogData(buildPayLogData(payReq));

        return null;
    }
}
