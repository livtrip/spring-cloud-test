package com.itmuch.cloud.study.account.bean.dto;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * Description:
 *
 * @author xierongli
 * @create 2019-08-27 22:36
 */
@Data
public class IdCardOcrDTO {

    /**类型 0反面 1正面(有头像)　*/
    private Integer type;
    private String msg;
    private String code;
    private String flowId;
    private String folk;

    /**正面回传参数*/
    private String address;
    private String birthday;
    private String cId;
    private String cName;
    private String faceImage;
    private String sex;

    /**反面回传参数*/
    private String authority;
    private String validdate1;
    private String validdate2;
}
