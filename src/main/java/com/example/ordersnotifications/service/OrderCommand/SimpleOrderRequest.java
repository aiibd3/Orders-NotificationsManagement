package com.example.ordersnotifications.service.OrderCommand;

import com.example.ordersnotifications.api.model.Product;

import java.util.List;

public class SimpleOrderRequest extends OrderRequest {

    public List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
