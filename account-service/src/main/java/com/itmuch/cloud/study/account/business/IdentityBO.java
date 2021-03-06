package com.itmuch.cloud.study.account.business;


import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import com.itmuch.cloud.study.account.bean.qo.UserIdentityInfoQO;
import com.itmuch.cloud.study.account.bean.request.IdCardBase64ImgReq;
import com.itmuch.cloud.study.account.bean.response.IdCardOcrRes;
import com.itmuch.cloud.study.account.entity.UserIdentityInfo;
import com.itmuch.cloud.study.account.service.UserIdentityInfoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.net.util.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.security.KeyStore;
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
public class IdentityBO {

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    private final static  Integer FRONT = 1;

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

    @Autowired
    private UserIdentityInfoService userIdentityInfoService;

    /**
     * 提取身份证照片信息保存
     *  逻辑:
     *   1.重复提交会覆盖之前的数据
     *   2.正面照数据保存
     *   3.反面照数据保存
     * @param idCardBase64ImgReq
     * @return
     */
    public IdCardOcrRes idCardOcr(IdCardBase64ImgReq idCardBase64ImgReq) {
        try {
            Map<String, String> paramMap = new HashMap<String, String>();
            Map<String, String> contentMap = new HashMap<String, String>();
            contentMap.put("img", idCardBase64ImgReq.getIdcardBase64Img());
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
            String resultJson = executePost(requestUrl.toString(), null, paramMap, null, "UTF-8");

            resultJson = decrypt(resultJson, realSecret);
            log.info("retJson={}", resultJson);

            IdCardOcrRes IdCardOcrRes = JSON.parseObject(resultJson, IdCardOcrRes.class);
            Integer count =  userIdentityInfoService.countByCondition(UserIdentityInfoQO.builder().userId(idCardBase64ImgReq.getUserId()).build());
            UserIdentityInfo userIdentityInfo = buildUserIdentityInfo(IdCardOcrRes);
            userIdentityInfo.setUserId(idCardBase64ImgReq.getUserId());
            //不存在身份认证信息则新增，存在则更新
            if(count == 0){
                userIdentityInfoService.insert(userIdentityInfo);
            }else{
                userIdentityInfoService.updateByCondition(userIdentityInfo, UserIdentityInfoQO.builder().userId(idCardBase64ImgReq.getUserId()).build());
            }

        } catch (Exception e) {
            log.error("身份证识别异常 e:{}", e);
        }

        return null;
    }

    public UserIdentityInfo buildUserIdentityInfo(IdCardOcrRes IdCardOcrRes){
        UserIdentityInfo userIdentityInfo = new UserIdentityInfo();
        if(IdCardOcrRes.getType() == FRONT){
            //正面照信息
            userIdentityInfo.setIdentityAddress(IdCardOcrRes.getAddress());
            userIdentityInfo.setBirthday(IdCardOcrRes.getBirthday());
            userIdentityInfo.setIdentityId(IdCardOcrRes.getCId());
            userIdentityInfo.setRealName(IdCardOcrRes.getCName());
            userIdentityInfo.setSex(IdCardOcrRes.getSex().equals("男")?1:0);
        }else{
            String startDate = IdCardOcrRes.getValiddate1();
            String endDate = IdCardOcrRes.getValiddate2();
            //TODO 签发机关保存进入数据库
            String authority = IdCardOcrRes.getAuthority();
            userIdentityInfo.setStartDate(DateUtil.parse(startDate, DatePattern.PURE_DATE_PATTERN));
            userIdentityInfo.setEndDate(DateUtil.parse(endDate, DatePattern.PURE_DATE_PATTERN));
        }
        return userIdentityInfo;
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

    private String executePost(String url, String postData, Map<String, String> paraMap, Map<String, String> reqHeadMap, String encodeCharset) {
        String responseBody = null;
        CloseableHttpClient client = null;
        HttpPost post = null;

        try {
            // 创建HttpClient客户端

            KeyStore truststore = KeyStore.getInstance(KeyStore.getDefaultType());

            FileInputStream truststoreFile = new FileInputStream(new ClassPathResource(keyStorePath).getFile());

            truststore.load(truststoreFile, password.toCharArray());

            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(truststore, new TrustSelfSignedStrategy()).build();

            client = HttpClients.custom().setSslcontext(sslContext).setSSLHostnameVerifier(new NoopHostnameVerifier()).build();

            post = new HttpPost(url);
            // 设定头部信息
            if (reqHeadMap != null) {
                for (String key : reqHeadMap.keySet()) {
                    post.addHeader(key, reqHeadMap.get(key));
                }
            }

            if (!StringUtils.isEmpty(postData)) {
                post.setEntity(new StringEntity(postData, encodeCharset == null ? "UTF-8" : encodeCharset));
            } else {
                if (paraMap != null) {
                    List<NameValuePair> formParams = new ArrayList<NameValuePair>();
                    for (Map.Entry<String, String> entry : paraMap.entrySet()) {
                        formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
                    }
                    post.setEntity(new UrlEncodedFormEntity(formParams, encodeCharset == null ? "UTF-8" : encodeCharset));

                }
            }
            CloseableHttpResponse response = client.execute(post);
            int responseCode = response.getStatusLine().getStatusCode();
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                if (responseCode == HttpStatus.SC_OK) {
                    if (entity != null) {
                        responseBody = EntityUtils.toString(entity, "UTF-8");
                    }
                } else if (response.getStatusLine().getStatusCode() == HttpStatus.SC_NOT_FOUND) {
                    return null;
                }
            }

            if (StringUtils.isNotBlank(responseBody)) {
                return responseBody;
            }
        } catch (Exception e) {
            log.error("Error occurred when send HttpPost: " + url, e);
        } finally {
            if (post != null && !post.isAborted()) {
                post.abort();
            }
            post.releaseConnection();

            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return responseBody;
    }
}
