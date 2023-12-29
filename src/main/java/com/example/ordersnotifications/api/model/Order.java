package com.example.ordersnotifications.api.model;

import java.util.List;

public class Order {

    private int orderId;
    private Customer customer;
    private List<Product> productList;
    private boolean shipped;

    public Order(int orderId, Customer customer, List<Product> productList, boolean shipped) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = productList;
        this.shipped = shipped;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public boolean isShipped() {
        return shipped;
    }

    public void setShipped(boolean shipped) {
        this.shipped = shipped;
    }

    public String getOrderDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Order ID: ").append(orderId).append("\n");
        details.append("Customer ID: ").append(customer.getAccountId()).append("\n");
        details.append("Product List: ").append(productList).append("\n");
        details.append("Shipped: ").append(shipped).append("\n");
        // Add more details as needed
        return details.toString();
    }
}
