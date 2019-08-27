package com.itmuch.cloud.study.account.service.impl;

import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSON;
import com.itmuch.cloud.study.account.bean.dto.IdCardOcrDTO;
import com.itmuch.cloud.study.account.service.IdentityService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.net.util.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * 〈一句话功能简述〉<br>
 * Description: 身份证服务实现
 *
 * @author xierongli
 * @create 2019-08-27 22:33
 */
@Service
@Slf4j
public class IdentityServiceImpl implements IdentityService {

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    @Value("${cloudwalk.domain}")
    private String cloudwalkDomain;
    @Value("${cloudwalk.appid}")
    private String appid;
    @Value("${cloudwalk.secret}")
    private String secret;
    @Value("${cloudwalk.keyStorePath}")
    private String keyStorePath;
    @Value("${cloudwalk.trustStorePath}")
    private String trustStorePath;
    @Value("${cloudwalk.password}")
    private String password;
    @Value("${cloudwalk.score}")
    private BigDecimal score;
    @Value("${cloudwalk.idcardScore}")
    private BigDecimal idcardScore;


    @Override
    public IdCardOcrDTO idCardOcr(String idcardBase64Img) {
        try{
            Map<String, String> paramMap = new HashMap<String, String>();
            Map<String, String> contentMap = new HashMap<String, String>();
            contentMap.put("img", idcardBase64Img);
            String content = JSON.toJSONString(contentMap);

            String realSecret = secret.toUpperCase().substring(8, 24);
            paramMap.put("appid", appid);
            String sParam = encrypt(content, realSecret);
            paramMap.put("sParam", sParam);
            String lol = digest(sParam, "MD5");
            paramMap.put("lol", lol);
            long millis = System.currentTimeMillis();
            String signature = generateSignature(appid, lol, millis);
            paramMap.put("signature", signature);
            paramMap.put("timestamp", "" + millis);

            StringBuilder requestUrl = new StringBuilder();
            requestUrl.append(cloudwalkDomain + "/cweis/faceRecog/idCardOcr");

            String resultJson = HttpRequest.post(requestUrl.toString()).body(JSON.toJSONString(paramMap)).execute().body();
            resultJson = decrypt(resultJson, realSecret);
            log.info("retJson={}", resultJson);

        }catch (Exception e){
            log.error("身份认证 e:{}", e);
        }

        return null;
    }

    private String decrypt(String content, String key) throws Exception {

        String ret = null;
        byte[] encrypted = Base64.decodeBase64(content);

        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");

        SecretKeySpec keyspec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
        IvParameterSpec ivspec = new IvParameterSpec(key.getBytes("UTF-8"));

        cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);
        byte[] original = cipher.doFinal(encrypted);
        ret = new String(original);
        return ret.trim();
    }


    public String encrypt(String content, String key) throws Exception {

        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        int blockSize = cipher.getBlockSize();
        byte[] dataBytes = content.getBytes("UTF-8");
        int plaintextLength = dataBytes.length;
        if (plaintextLength % blockSize != 0) {
            plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
        }

        byte[] plaintext = new byte[plaintextLength];
        System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);

        SecretKeySpec keyspec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
        IvParameterSpec ivspec = new IvParameterSpec(key.getBytes("UTF-8"));
        cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);

        byte[] encrypted = cipher.doFinal(plaintext);
        return Base64.encodeBase64String(encrypted).replaceAll("\\s+|\n|\r|\t", "");
    }

    private String digest(String strSrc, String encName) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = null;
        String strDes = null;
        byte[] bt = strSrc.getBytes("UTF-8");
        if (encName == null || encName.equals("")) {
            encName = "MD5";
        }
        md = MessageDigest.getInstance(encName);
        md.update(bt);
        strDes = bytesToHexString(md.digest()); // to HexString
        return strDes;
    }
    private String bytesToHexString(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

    private String generateSignature(String appid, String lol, long millis) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String timestamp = String.valueOf(millis);
        String signature = null;
        if (!StringUtils.isEmpty(timestamp) && !StringUtils.isEmpty(appid)) {
            List<String> srcList = new ArrayList<String>();
            srcList.add(timestamp);
            srcList.add(appid);
            srcList.add(lol);
            // 按照字典序逆序拼接参数
            Collections.sort(srcList);
            Collections.reverse(srcList);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < srcList.size(); i++) {
                sb.append(srcList.get(i));
            }
            signature = digest(sb.toString(), "SHA-1");
            srcList.clear();
            srcList = null;
        }
        return signature;
    }
}
