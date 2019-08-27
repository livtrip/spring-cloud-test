package com.itmuch.cloud.study.account.exception;

/**
 * 第三方接口服务异常
 * Created by rize on 2019/7/3.
 */
public class ThirdPartServiceException extends ServiceException {

    public ThirdPartServiceException(String message, int code) {
        super(message, code);
    }

}
