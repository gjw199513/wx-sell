package com.gjw.sell.service;

import com.gjw.sell.dto.OrderDTO;

/**
 * @author gjw19
 * @date 2018/12/3
 */
public interface BuyerService {

    /**
     * 查询一个订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * 取消订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO cancelOrder(String openid, String orderId);
}
