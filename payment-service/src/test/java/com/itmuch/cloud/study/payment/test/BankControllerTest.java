package com.itmuch.cloud.study.payment.test;

import com.alibaba.fastjson.JSON;
import com.itmuch.cloud.study.payment.PaymentApplication;
import com.itmuch.cloud.study.payment.bean.request.CardBinReq;
import com.itmuch.cloud.study.payment.controller.BankController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 〈一句话功能简述〉<br>
 * Description:
 *
 * @author xierongli
 * @create 2019-09-19 16:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PaymentApplication.class)
public class BankControllerTest {


    @Autowired
    private BankController bankController;


    @Test
    public void checkBankBin(){
        CardBinReq cardBinReq = new CardBinReq();
        cardBinReq.setCustomerId(1L);
        cardBinReq.setBankNo("6212261202044140516");

        System.out.println(JSON.toJSONString(bankController.checkBankBin(cardBinReq)));
    }
}
