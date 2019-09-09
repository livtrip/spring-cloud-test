package com.itmuch.cloud.study.account.test;

import com.itmuch.cloud.study.account.bean.request.IdCardBase64ImgReq;
import com.itmuch.cloud.study.account.controller.IdentityController;
import com.itmuch.cloud.study.common.util.ImgUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 〈一句话功能简述〉<br>
 * Description: 身份证识别服务
 *
 * @author xierongli
 * @create 2019-08-27 22:58
 */
@RunWith(SpringRunner.class)
//@SpringBootTest(classes = AccountApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
@SpringBootTest
public class IdentityControllerTest {


    @Autowired
    private IdentityController identityController;


    @Test
    public void idCardOcr(){
        String path1 = "/Users/mark1xie/workspace/spring-cloud-test-v/account-service/src/main/resources/static/a-back.jpeg";
//        String path2 = "/Users/markxrrl/workspace-cloud/spring-cloud-test/account-service/src/main/resources/static/test.jpg";

        String faceImg = ImgUtil.getBase64Img(path1);
        System.out.println(faceImg);
        IdCardBase64ImgReq idCardBase64ImgReq = new IdCardBase64ImgReq();
        idCardBase64ImgReq.setIdcardBase64Img(faceImg);
        idCardBase64ImgReq.setUserId(1L);
        identityController.idCardOcr(idCardBase64ImgReq);
    }
}
