package com.gjw.sell.service;

import com.gjw.sell.dataobject.ProductInfo;
import com.gjw.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 * @author gjw19
 * @date 2018/12/1
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有商品带分页
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     *
     * @param cartDTOList
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减库存
     *
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);

    /**
     * 上架
     *
     * @param productId
     * @return
     */
    ProductInfo onSale(String productId);

    /**
     * 下架
     *
     * @param productId
     * @return
     */
    ProductInfo offSale(String productId);
}
