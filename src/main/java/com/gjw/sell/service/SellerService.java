package com.gjw.sell.service;

import com.gjw.sell.dataobject.SellerInfo;

/**
 * 卖家端
 *
 * @author Administrator
 * @since 2018/12/5.
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     *
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);

}
