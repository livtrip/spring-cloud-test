package com.itmuch.cloud.study.payment.service;

import com.itmuch.cloud.study.payment.bean.qo.CheckOutRecordQO;
import com.itmuch.cloud.study.payment.entity.CheckOutRecord;

import java.util.List;

/**
 * 商户服务
 *
 * @author lixin
 * @date 2019/9/4 19:27
 **/
public interface MerchantService {

    List<CheckOutRecord> queryForList(CheckOutRecordQO qo);
}
