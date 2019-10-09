package com.itmuch.cloud.study.payment.service.impl;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.itmuch.cloud.study.payment.utils.YeepayUtils;
import com.yeepay.g3.sdk.yop.client.YopClient3;
import com.yeepay.g3.sdk.yop.client.YopRequest;
import com.yeepay.g3.sdk.yop.client.YopResponse;
import com.yeepay.g3.sdk.yop.encrypt.DigitalEnvelopeDTO;
import com.yeepay.g3.sdk.yop.utils.DigitalEnvelopeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class YeepayService {

  public final static  Logger log = LoggerFactory.getLogger(YeepayService.class);



  public static Map<String, String> yeepayYOP(Map<String, String> map, String Uri, String appKey,String secretKey)
      throws IOException {

    YopRequest yoprequest = new YopRequest(appKey,secretKey);
    Map<String, String> result = new HashMap<String, String>();
    Set<Entry<String, String>> entry = map.entrySet();
    for (Entry<String, String> s : entry) {
      yoprequest.addParam(s.getKey(), s.getValue());
    }

    System.out.println("url:" + Uri);
    System.out.println("yoprequest:" + yoprequest.getParams());

    //向YOP发请求
    YopResponse yopresponse = YopClient3.postRsa(Uri, yoprequest);
    System.out.println("请求YOP之后结果：" + yopresponse.toString());
    System.out.println("请求YOP之后结果：" + yopresponse.getStringResult());

    //对结果进行处理
    if ("FAILURE".equals(yopresponse.getState())) {
      if (yopresponse.getError() != null) {
        result.put("errorcode", yopresponse.getError().getCode());
      }
      result.put("errormsg", yopresponse.getError().getMessage());
      System.out.println("错误明细：" + yopresponse.getError().getSubErrors());
      System.out.println("系统处理异常结果：" + result);
      return result;
    }
    //成功则进行相关处理
    if (yopresponse.getStringResult() != null) {
      result = parseResponse(yopresponse.getStringResult());
      System.out.println("yopresponse.getStringResult: " + result);
    }
    return result;
  }

  //将获取到的yopresponse转换成json格式
  public static Map<String, String> parseResponse(String yopresponse) {

    Map<String, String> jsonMap = new HashMap<>();
    jsonMap = JSON.parseObject(yopresponse,
        new TypeReference<TreeMap<String, String>>() {
        });
    System.out.println("将结果yopresponse转化为map格式之后: " + jsonMap);
    return jsonMap;
  }

  /**
   * 易宝支付回调解密
   */
  public static Map<String, String> yeepayJson(String response, String privateSecretKey, String publicSecretKey) {
    //开始解密
    DigitalEnvelopeDTO dto = new DigitalEnvelopeDTO();
    dto.setCipherText(response);
    PrivateKey privateKey = YeepayUtils.getPrivateKey(privateSecretKey);
    System.out.println("privateKey: " + privateKey);
    PublicKey publicKey = YeepayUtils.getPubKey(publicSecretKey);
    System.out.println("publicKey: " + publicKey);

    dto = DigitalEnvelopeUtils.decrypt(dto, privateKey, publicKey);
    log.info("解密结果:" + dto.getPlainText());
    return parseResponse(dto.getPlainText());
  }



}
        

