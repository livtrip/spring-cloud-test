package com.itmuch.cloud.study.payment.proxy;

import com.itmuch.cloud.study.payment.bean.request.PayReq;
import com.itmuch.cloud.study.payment.entity.PayLogData;

/**
 * 〈一句话功能简述〉<br>
 * Description: 易宝支付业务
 *
 * @author xierongli
 * @create 2019/9/9 11:28 上午
 */
public abstract class BaseProxy {


    public abstract PayLogData buildPayLogData(PayReq payReq);


    public void insertPayLogData(PayLogData payLogData){
        //插入支付日志数据
        System.out.println("插入支付日志记录");
    }



}
