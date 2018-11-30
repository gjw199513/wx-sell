package com.gjw.sell.repository;

import com.gjw.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Administrator
 * @since 2018/11/30.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

}
