package com.gjw.sell.service;

import com.gjw.sell.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;

/**
 * 支付
 *
 * @author gjw19
 * @date 2018/12/3
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    /**
     * 异步通知
     *
     * @param notifyData
     */
    PayResponse notify(String notifyData);

    /**
     * 退款
     *
     * @param orderDTO
     * @return
     */
    RefundResponse refund(OrderDTO orderDTO);
}
