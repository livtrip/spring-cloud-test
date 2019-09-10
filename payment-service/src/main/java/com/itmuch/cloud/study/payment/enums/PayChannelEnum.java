package com.itmuch.cloud.study.payment.enums;

/**
 * 支付渠道枚举
 */
public enum PayChannelEnum {
    YEE_PAY(1,"易宝"),
    ALI_PAY(2,"支付宝"),
    WE_CHAT(3,"微信");

    private Integer code;

    private String description;

    PayChannelEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
