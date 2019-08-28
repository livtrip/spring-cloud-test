package com.itmuch.cloud.study.account.service;

import com.itmuch.cloud.study.account.bean.dto.IdCardOcrDTO;
import com.itmuch.cloud.study.account.bean.request.IdCardBase64ImgReq;

public interface IdentityService {

    /**
     * 身份证识别
     * @param  idCardBase64ImgReq 身份证图片信息
     * @return
     * @author xierongli
     * @date 18/1/23 下午5:30
     */
    IdCardOcrDTO idCardOcr(IdCardBase64ImgReq idCardBase64ImgReq);
}
