package com.itmuch.cloud.study.payment.context;

import com.itmuch.cloud.study.payment.enums.PayChannelEnum;
import com.itmuch.cloud.study.payment.proxy.PayProxy;
import com.itmuch.cloud.study.payment.proxy.YeepayProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * Description: 支付上下文
 *
 * @author xierongli
 * @create 2019/9/9 11:30 上午
 */
@Component
public class BaseContext {

    @Autowired
    private DataTable dataTable;


    public PayProxy createPayProxy(Integer payChannel){
        if(payChannel == PayChannelEnum.YEE_PAY.getCode()){
            return dataTable.of(YeepayProxy.class);
        }else if(payChannel == PayChannelEnum.ALI_PAY.getCode()){

        }
        return null;
    }

}
