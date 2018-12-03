package com.gjw.sell.repository;

import com.gjw.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author gjw19
 * @date 2018/12/1
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String>  {

    List<OrderDetail> findByOrderId(String orderId);
}
