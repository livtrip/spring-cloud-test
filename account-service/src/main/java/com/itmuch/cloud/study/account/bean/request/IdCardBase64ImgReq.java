package com.itmuch.cloud.study.account.bean.request;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * Description: 身份证认证传参模型
 *
 * @author xierongli
 * @create 2019-08-27 22:27
 */
@Data
public class IdCardBase64ImgReq {
    /**
     * 身份证图片参数
     */
    private String idcardBase64Img;

}
