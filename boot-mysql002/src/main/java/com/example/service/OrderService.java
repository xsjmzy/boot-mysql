package com.example.service;

import com.example.pojo.Order;

public interface OrderService {
    //添加数据
    Boolean add(Order order);

    //删除
    Boolean del(Integer oid);

    //修改数据
    Boolean update(Order order);

    //查数据
    Order find(Integer oid);
}
