package com.gjw.sell.form;

import lombok.Data;

/**
 * @author gjw19
 * @date 2018/12/4
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /**
     * 类目名字.
     */
    private String categoryName;

    /**
     * 类目编号.
     */
    private Integer categoryType;
}
