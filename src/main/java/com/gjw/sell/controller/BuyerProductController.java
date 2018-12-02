package com.gjw.sell.controller;

import com.gjw.sell.VO.ProductInfoVO;
import com.gjw.sell.VO.ProductVO;
import com.gjw.sell.VO.ResultVO;
import com.gjw.sell.dataobject.ProductCategory;
import com.gjw.sell.dataobject.ProductInfo;
import com.gjw.sell.service.CategoryService;
import com.gjw.sell.service.ProductService;
import com.gjw.sell.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 买家商品
 * @author gjw19
 * @date 2018/12/1
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list(){
        // 1. 查询所有的上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        // 2. 查询类目（一次性查询）
//        List<Integer> categoryTypeList = new ArrayList<>();
        // 传统方法
//        for(ProductInfo productInfo: productInfoList){
//            categoryTypeList.add(productInfo.getCategoryType());
//        }
        // 精简方法（java8，lambda）
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        // 3. 数据拼装
        List<ProductVO> productVOList = new ArrayList<>();
        for(ProductCategory productCategory:productCategoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategotyName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for(ProductInfo productInfo:productInfoList){
                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    // 把一个对象里面属性的值copy另一个对象中
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }
}
