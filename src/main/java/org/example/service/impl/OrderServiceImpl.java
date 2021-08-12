package org.example.service.impl;

import org.example.pojo.Order;
import org.example.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author Mrs Yang
 * @date 2021/3/31 21:50
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public boolean addOrder(Order order) {
        return false;
    }
}
