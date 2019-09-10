package com.itmuch.cloud.study.payment.proxy;

import com.itmuch.cloud.study.payment.bean.request.PayReq;
import com.itmuch.cloud.study.payment.bean.response.PayRes;

public interface PayProxy {
    /**
     * 支付
     * @param payReq
     * @return
     */
    PayRes pay(PayReq payReq);
}
