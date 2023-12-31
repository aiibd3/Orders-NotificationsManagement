package com.example.ordersnotifications.api.controller;

import com.example.ordersnotifications.api.model.CompoundOrder;
import com.example.ordersnotifications.api.model.Customer;
import com.example.ordersnotifications.api.model.Order;
import com.example.ordersnotifications.api.model.Product;
import com.example.ordersnotifications.service.OrderCommand.CompoundOrderRequest;
import com.example.ordersnotifications.service.OrderCommand.SimpleOrderRequest;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/orders")
public class OrderController {

    @POST
    @Path("/placeOrder")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Order placeOrder(SimpleOrderRequest simpleOrderRequest) {
        Customer customer = new Customer(simpleOrderRequest.getAccountId(), simpleOrderRequest.getBalance());
        List<Product> products = simpleOrderRequest.getProducts();
        Order order = customer.placeOrder(products);
        return order;
    }

    @POST
    @Path("/placeCompoundOrder")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CompoundOrder placeCompoundOrder(CompoundOrderRequest compoundOrderRequest) {
        Customer customer = new Customer(compoundOrderRequest.getAccountId(), compoundOrderRequest.getBalance());
        List<Order> orders = compoundOrderRequest.getOrders();
        CompoundOrder compoundOrder = customer.placeCompoundOrder(orders);
        return compoundOrder;
    }
}
