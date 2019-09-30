package com.itmuch.cloud.study.common.util;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class OcrUtil {
    //设置APPID/AK/SK
    public static final String APP_ID =  ConfigUtil.BAIDU_OCR_APP_ID;
    public static final String API_KEY = ConfigUtil.BAIDU_OCR_APP_KEY;
    public static final String SECRET_KEY = ConfigUtil.BAIDU_OCR_SECRET_KEY;

    private static AipOcr apiOcr;

    static {
        apiOcr = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
        apiOcr.setConnectionTimeoutInMillis(2000);
        apiOcr.setSocketTimeoutInMillis(60000);
    }


    /**
     * 通用图片识别
     * @param client
     */
    public static void basicImageOcr(AipOcr client)  {
        String path = null;
        try {
            path = ResourceUtils.getFile("classpath:static/images/test.png").getAbsolutePath();
            JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
            System.out.println(res.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 身份证识别
     * @param client
     */
    public static void identityOcr(AipOcr client){
        // 参数为本地图片路径
        String image = null;
        try {
            // 传入可选参数调用接口
            HashMap<String, String> options = new HashMap<String, String>();
            options.put("detect_direction", "true");
            options.put("detect_risk", "false");
            String idCardSide = "front";
            image = ResourceUtils.getFile("classpath:static/images/test.jpg").getAbsolutePath();
            JSONObject res = client.idcard(image, idCardSide, options);
            System.out.println(res.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 银行卡识别
     * @param client
     */
    public static void bankCardOcr(AipOcr client){
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        // 参数为本地图片路径
        String image = null;
        try {
            image = ResourceUtils.getFile("classpath:static/images/bank.jpg").getAbsolutePath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        JSONObject res = client.bankcard(image, options);
        System.out.println(res.toString());
    }

    /**
     * 驾照识别
     * @param client
     */
    public static void drivingLicenseOcr(AipOcr client){
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("detect_direction", "true");


        // 参数为本地图片路径
        String image = null;
        try {
            image = ResourceUtils.getFile("classpath:static/images/driver.jpg").getAbsolutePath();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        JSONObject res = client.drivingLicense(image, options);
        System.out.println(res.toString());
    }

    /**
     * 营业执照识别
     * @param apiOcr
     * @param path
     * @return
     */
    public static Map<String,Object> parseLicence(AipOcr apiOcr, String path) {
        Map<String,Object> result = new HashMap<>();
        try{
            JSONObject res2 = apiOcr.basicGeneral(path, new HashMap<String, String>());
            JSONArray res = (JSONArray) res2.get("words_result");

            if (res.length() > 0) {
                for (int key = 0; key < res.length(); key++) {
                    result.put("code","0");
                    JSONObject object = (JSONObject) res.get(key);
                    String value = object.getString("words");
                    if(value.startsWith("法定代表人")){
                        result.put("name",value.substring(5,value.length()));
                    }
                    if(value.trim().startsWith("名称")){
                        result.put("companyName",value.substring(2,value.length()));
                    }else if(value.trim().startsWith("称")){
                        result.put("companyName",value.substring(1,value.length()));
                    }
                    if(value.startsWith("统一社会信用代码")){
                        result.put("creditCode",value.substring(8,value.length()));
                    }
                }
                return result;
            }else{
                result.put("code","-1");
                result.put("creditCode","");
            }
        }catch (Exception e){

        }
        return result;
    }


}
