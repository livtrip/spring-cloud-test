package com.itmuch.cloud.study.account.bean.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserQO {

    private Long id;

    private String nickName;

    private String name;

    private Integer gender;

    private String avatarUrl;

    private Integer type;

    private Integer status;

    private String openId;

    private String unionId;

    private String phone;

    private String identityId;

    private String identityAddress;

    private Integer loginType;

    private String birthday;

    private String createPerson;

    private Date createTime;

    private String updatePerson;

    private Date updateTime;
}
