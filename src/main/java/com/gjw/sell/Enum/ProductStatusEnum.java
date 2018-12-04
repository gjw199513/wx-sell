package com.gjw.sell.Enum;

import lombok.Getter;

/**
 * 商品状态枚举类
 * @author gjw19
 * @date 2018/12/1
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
