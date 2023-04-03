package com.example.pojo;

import lombok.Data;

@Data
public class Order {
    private int orderId;
    private String orderName;
    private double orderPrice;
    private int orderUserId;
}

