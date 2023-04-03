package com.example.controller;

import com.example.pojo.Order;
import com.example.returnjson.OrderFindJson;
import com.example.returnjson.OrderJson;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public OrderJson add(@RequestBody Order order){
        OrderJson orderJson=new OrderJson();
        orderJson.setStatue(200);
        orderJson.setInfo("数据添加");
        orderJson.setData("添加失败");
        boolean isOk=orderService.add(order);
        if(isOk==true){
            orderJson.setData("添加成功");
        }
        return orderJson;
    }


    @DeleteMapping("/{uid}")
    public OrderJson del(@PathVariable Integer uid){
        OrderJson orderJson=new OrderJson();
        orderJson.setStatue(200);
        orderJson.setInfo("删除添加");
        orderJson.setData("删除失败");
        boolean isOk=orderService.del(uid);
        if(isOk==true){
            orderJson.setData("删除成功");
        }
        return orderJson;

    }


    @PutMapping
    public OrderJson del(@RequestBody Order order){
        OrderJson orderJson=new OrderJson();
        orderJson.setStatue(200);
        orderJson.setInfo("数据修改");
        orderJson.setData("修改失败");
        boolean isOk=orderService.update(order);
        if(isOk==true){
            orderJson.setData("修改成功");
        }
        return orderJson;

    }

    //查找数据
    @GetMapping("/{uid}")
    public OrderFindJson findJson(@PathVariable Integer uid){
        Order order=orderService.find(uid);
        OrderFindJson orderFindJson=new OrderFindJson();
        orderFindJson.setInfo("查询数据");
        orderFindJson.setStatue(200);
        orderFindJson.setOrder(order);
        return orderFindJson;
    }

}
