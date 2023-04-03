package com.example.mapper;

import com.example.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    //添加数据
    Integer add(@Param("order0") Order order);

    //删除
    Integer del(Integer oid);

    //修改数据
    Integer update(@Param("order1") Order order);

    //查数据
    Order findById(Integer oid);
}
