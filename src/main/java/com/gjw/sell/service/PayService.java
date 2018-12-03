package com.gjw.sell.service;

import com.gjw.sell.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;

/**
 * 支付
 *
 * @author gjw19
 * @date 2018/12/3
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);
}
