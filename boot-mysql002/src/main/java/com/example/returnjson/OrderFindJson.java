package com.example.returnjson;

import com.example.pojo.Order;
import lombok.Data;

@Data
public class OrderFindJson {
        private int statue;
        private String info;
        private Order order;
}
