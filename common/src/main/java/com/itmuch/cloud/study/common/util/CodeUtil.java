package com.itmuch.cloud.study.common.util;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * Description: 用于生成数据库code字段
 *
 * @author xierongli
 * @create 2019-09-25 11:50
 */
public class CodeUtil {


    public static String generate(String prefix) {
        return prefix + "-" + DateUtil.format(new Date(), DatePattern.PURE_DATETIME_FORMAT);
    }
}
