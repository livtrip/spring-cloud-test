package com.itmuch.cloud.study.payment.bean.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * Description:
 *
 * @author xierongli
 * @create 2019-09-15 20:08
 */
@ApiModel(value="CardBinRes",description= "银行卡输出类")
@Data
public class CardBinRes {

    @ApiModelProperty(value = "bankName")
    private String bankName;
    @ApiModelProperty(value = "logoCode")
    private String logoCode;
}
