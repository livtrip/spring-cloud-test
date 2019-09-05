package com.itmuch.cloud.study.payment.bean.qo;

import com.itmuch.cloud.study.payment.entity.CheckOutRecord;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO
 *
 * @author lixin
 * @date 2019/9/4 19:29
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CheckOutRecordQO extends CheckOutRecord {

    private static final long serialVersionUID = 906438047069300075L;
}
