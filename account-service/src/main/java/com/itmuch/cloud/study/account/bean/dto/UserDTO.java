package com.itmuch.cloud.study.account.bean.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
    /**
     * 手机
     */
    private String phone;

    private Integer loginType;

    private String openId;

    private String nickname;

    private String avatarUrl;

    private Integer level;

    private Date birthday;

    private Integer gender;

    private Date gmtLastLogin;

    private String lastLoginIp;

    private Integer status;

    /**
     * 登录成功，包装此参数
     */
    private String accessToken;
}
