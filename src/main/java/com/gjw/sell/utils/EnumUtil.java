package com.gjw.sell.utils;

import com.gjw.sell.Enum.CodeEnum;

/**
 * @author Administrator
 * @since 2018/12/4.
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
