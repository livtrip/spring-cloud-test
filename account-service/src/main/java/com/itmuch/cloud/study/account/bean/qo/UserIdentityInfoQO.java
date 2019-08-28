package com.itmuch.cloud.study.account.bean.qo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserIdentityInfoQO {

    private Long id;

    private Long userId;

    private String realName;

    private Integer sex;

    private String identityId;

    private String identityAddress;

    private Date startDate;

    private Date endDate;

    private String birthday;

    private String frontImagePath;

    private String backImagePath;

    private String headImagePath;

    private String realImagePath;

    private String createPerson;

    private Date createTime;

    private String updatePerson;

    private Date updateTime;
}
