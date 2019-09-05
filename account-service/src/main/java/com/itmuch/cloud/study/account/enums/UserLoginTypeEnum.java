package com.itmuch.cloud.study.account.enums;

public enum UserLoginTypeEnum {

    REGISTER(0, "手机注册"),
    MP_WEIXIN(1, "WX小程序登录"),
    APP_WEIXIN(2, "WX第三方登录"),
    ;

    UserLoginTypeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static boolean contains(Integer loginType) {
        if (loginType == null) {
            return false;
        }
        for (UserLoginTypeEnum type : values()) {
            if (type.getCode() == loginType) {
                return true;
            }
        }
        return false;
    }
}
