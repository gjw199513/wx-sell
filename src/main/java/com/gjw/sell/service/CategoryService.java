package com.gjw.sell.service;

import com.gjw.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author gjw19
 * @date 2018/12/1
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    /**
     * 通过类型列表查询商品列表
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
