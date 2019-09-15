package com.itmuch.cloud.study.payment.bean.request;

import io.swagger.annotations.ApiParam;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 〈一句话功能简述〉<br>
 * Description:
 *
 * @author xierongli
 * @create 2019-09-15 20:05
 */
@Data
public class CardBinReq {

    @ApiParam(value = "用户ID",required = true)
    @NotNull(message="userId不能为空")
    private Long customerId; //用户ID
    @ApiParam(value = "银行卡",required = true)
    @NotNull(message="bankNo不能为空")
    private String bankNo; //银行卡


}
