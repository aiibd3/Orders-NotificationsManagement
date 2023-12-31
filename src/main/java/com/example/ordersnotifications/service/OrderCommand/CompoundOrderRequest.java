package com.example.ordersnotifications.service.OrderCommand;

import com.example.ordersnotifications.api.model.Order;

import java.util.List;

public class CompoundOrderRequest extends OrderRequest {


    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
