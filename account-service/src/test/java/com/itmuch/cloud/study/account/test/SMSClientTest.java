package com.itmuch.cloud.study.account.test;

import com.itmuch.cloud.study.account.AccountApplication;
import com.itmuch.cloud.study.account.exception.ServiceException;
import com.itmuch.cloud.study.account.notify.SMSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AccountApplication.class)
public class SMSClientTest {


    @Autowired
    private SMSClient smsClient;

    @Test
    public void test(){
        try {
            smsClient.sendAdminLoginVerify("15355099653","000000");
        } catch (ServiceException e) {
            e.printStackTrace();
        }

    }
}
