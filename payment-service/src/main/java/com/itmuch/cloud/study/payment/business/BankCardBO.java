package com.itmuch.cloud.study.payment.business;

import com.itmuch.cloud.study.common.base.Result;
import com.itmuch.cloud.study.common.base.Results;
import com.itmuch.cloud.study.payment.bean.request.CardBinReq;
import com.itmuch.cloud.study.payment.bean.response.CardBinRes;
import com.itmuch.cloud.study.payment.config.YeePayConfig;
import com.itmuch.cloud.study.payment.service.impl.YeepayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * Description: 银行卡业务
 *
 * @author xierongli
 * @create 2019-09-15 20:07
 */
@Service
@Slf4j
public class BankCardBO {


    @Autowired
    private YeePayConfig yeePayConfig;


    /**
     * 检验银行卡bin
     * @param CardBinReq
     * @return
     */
    public Result<CardBinRes> checkBankBin(CardBinReq CardBinReq) {
        try {
            CardBinRes CardBinRes = new CardBinRes();
                Map<String, String> params = new HashMap<>(16);
                params.put("merchantno", yeePayConfig.getPublicSecretKey());
                params.put("cardno", CardBinReq.getBankNo());
                Map<String, String> yopresponsemap = YeepayService.yeepayYOP(params, yeePayConfig.getBankCardQueryUri(), yeePayConfig.getAppKey(), yeePayConfig.getPrivateSecretKey());
                if (yopresponsemap.get("errormsg") == null) {
                    if ("INVALID".equals(yopresponsemap.get("isvalid"))) {
                        return Results.newFailedResult("银行卡号无效！");
                    }
                    CardBinRes.setBankName(yopresponsemap.get("bankname"));
                    CardBinRes.setLogoCode(yopresponsemap.get("bankcode"));
                }
            return Results.newSuccessResult(CardBinRes);
        } catch (Exception e) {
            log.error("checkBankBin{} 校验银行卡bin异常", e);
            return Results.newFailedResult("checkBankBin{} 校验银行卡bin异常");
        }
    }


}
