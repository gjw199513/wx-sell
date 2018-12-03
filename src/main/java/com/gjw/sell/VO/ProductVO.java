package com.gjw.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品（包含类目）
 * @author gjw19
 * @date 2018/12/1
 */
@Data
public class ProductVO {


    // 解决属性名称和返回json名称不一致的问题
    @JsonProperty("name")
    private String categotyName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
