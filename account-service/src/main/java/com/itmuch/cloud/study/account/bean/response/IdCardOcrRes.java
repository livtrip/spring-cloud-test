package com.itmuch.cloud.study.account.bean.response;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * Description: 人脸识别返回模型
 *
 * @author xierongli
 * @create 2019-08-27 22:23
 */
@Data
public class IdCardOcrRes {

    /**类型 0反面 1正面(有头像)*/
    private Integer type;
    /**正面回传参数*/
    /**地址*/
    private String address;
    /**生日*/
    private String birthday;
    /**身份证Id*/
    private String cId;
    /**姓名*/
    private String cName;
    /**头像*/
    private String faceImage;
    /**性别*/
    private String sex;

    /**反面回传参数*/
    /**公安局*/
    private String authority;
    /**开始日期*/
    private String validdate1;
    /**结束日期*/
    private String validdate2;

}
