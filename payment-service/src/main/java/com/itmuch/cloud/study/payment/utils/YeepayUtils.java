package com.itmuch.cloud.study.payment.utils;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

/**
 * @author yubin
 */
public class YeepayUtils {

  /**
   * 实例化公钥
   */
  public static PublicKey getPubKey(String publickey) {
    PublicKey publicKey = null;
    try {

      // 自己的公钥(测试)
      java.security.spec.X509EncodedKeySpec bobPubKeySpec = new java.security.spec.X509EncodedKeySpec(
          Base64.getDecoder().decode(publickey));
      // RSA对称加密算法
      KeyFactory keyFactory;
      keyFactory = KeyFactory.getInstance("RSA");
      // 取公钥匙对象
      publicKey = keyFactory.generatePublic(bobPubKeySpec);
    } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
      e.printStackTrace();
    }
    return publicKey;
  }

  public static PrivateKey getPrivateKey(String priKey) {
    PrivateKey privateKey = null;
    PKCS8EncodedKeySpec priPKCS8;
    try {
      priPKCS8 = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(priKey));
      KeyFactory keyf = KeyFactory.getInstance("RSA");
      privateKey = keyf.generatePrivate(priPKCS8);
    } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
      e.printStackTrace();
    }
    return privateKey;
  }
}
