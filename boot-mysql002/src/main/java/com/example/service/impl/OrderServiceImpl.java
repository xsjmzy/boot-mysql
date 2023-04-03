package com.example.service.impl;

import com.example.mapper.OrderMapper;
import com.example.pojo.Order;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Boolean add(Order order) {
        int row=orderMapper.add(order);
        return row>0;
    }

    @Override
    public Boolean del(Integer oid) {
        int row=orderMapper.del(oid);
        return row>0;
    }

    @Override
    public Boolean update(Order order) {
        int row=orderMapper.update(order);
        return row>0 & row!=0;
    }

    @Override
    public Order find(Integer oid) {
        return orderMapper.findById(oid);
    }
}
