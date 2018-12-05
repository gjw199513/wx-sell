package com.gjw.sell.service.impl;

import com.gjw.sell.dataobject.SellerInfo;
import com.gjw.sell.repository.SellerInfoRepository;
import com.gjw.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @since 2018/12/5.
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
