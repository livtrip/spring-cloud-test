package com.itmuch.cloud.study.account.bean.request;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * 〈一句话功能简述〉<br>
 * Description: 身份证认证传参模型
 *
 * @author xierongli
 * @create 2019-08-27 22:27
 */
@Data
public class IdCardBase64ImgReq {

    //用户Id
    @NotNull(message = "userId不能为空")
    private Long userId;
    //身份证图片参数
    @NotBlank(message = "图像数据不能为空")
    private String idcardBase64Img;
    //类型 1:正面 2反面
    private Integer type = 1;

}
