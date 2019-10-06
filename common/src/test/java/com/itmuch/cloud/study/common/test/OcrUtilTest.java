package com.itmuch.cloud.study.common.test;

import com.itmuch.cloud.study.common.util.OcrUtil;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;

/**
 * 〈一句话功能简述〉<br>
 * Description: 百度识别工具类
 *
 * @author xierongli
 * @create 2019-10-04 15:51
 */
public class OcrUtilTest {


    public static void main(String[] args) {

        String basicImagePath = "test.png";
        System.out.println(OcrUtil.basicImageOcr(basicImagePath));
        System.out.println(OcrUtil.identityOcr("a-fromt.jpeg", "front"));
        System.out.println(OcrUtil.identityOcr("a-back.jpeg", "back"));
//        System.out.println(OcrUtil.bankCardOcr("bank.png"));

        try {
            String path  = ResourceUtils.getFile("classpath:static/business.png").getAbsolutePath();
            String path1 = "/Users/mark1xie/workspace-cloud/spring-cloud-test-v/common/src/main/resources/static/business.png";
            System.out.println(OcrUtil.parseLicence(path1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
