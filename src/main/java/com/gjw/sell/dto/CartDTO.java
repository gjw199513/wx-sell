package com.gjw.sell.dto;

import lombok.Data;

/**
 * 购物车
 *
 * @author gjw19
 * @date 2018/12/2
 */
@Data
public class CartDTO {

    /**
     * 商品Id
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
