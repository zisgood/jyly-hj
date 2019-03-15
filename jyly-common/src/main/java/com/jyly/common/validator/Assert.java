package com.jyly.common.validator;

import com.jyly.common.exception.CommonException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 *
 * @author zhouhua
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new CommonException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new CommonException(message);
        }
    }
}
