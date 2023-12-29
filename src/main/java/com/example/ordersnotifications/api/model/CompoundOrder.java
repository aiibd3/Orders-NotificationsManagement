package com.example.ordersnotifications.api.model;

import java.util.List;

public class CompoundOrder {

    private int compoundOrderId;
    private List<Order> orderList;
    private List<Customer> customers;
    private boolean shipped;

    public CompoundOrder(int compoundOrderId, List<Order> orderList, boolean shipped) {
        this.compoundOrderId = compoundOrderId;
        this.orderList = orderList;
        this.shipped = shipped;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public int getCompoundOrderId() {
        return compoundOrderId;
    }

    public void setCompoundOrderId(int compoundOrderId) {
        this.compoundOrderId = compoundOrderId;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public boolean isShipped() {
        return shipped;
    }

    public void setShipped(boolean shipped) {
        this.shipped = shipped;
    }

    public String getCompoundOrderDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Compound Order ID: ").append(compoundOrderId).append("\n");
        details.append("Order List: ").append(orderList).append("\n");
        details.append("Shipped: ").append(shipped).append("\n");
        // Add more details as needed
        return details.toString();
    }
}