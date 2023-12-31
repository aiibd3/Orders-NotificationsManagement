package com.example.ordersnotifications.api.controller;

import com.example.ordersnotifications.api.model.Customer;
import com.example.ordersnotifications.api.model.Order;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;


@Path("/customers")
public class CustomerController {

    @POST
    @Path("/createAccount")
    @Consumes(MediaType.APPLICATION_JSON)
    public String createAccount(Customer customerRequest) {
        Customer customer = new Customer(customerRequest.getAccountId(), customerRequest.getBalance(), customerRequest.getName());

        return "Account created successfully";
    }

    @DELETE
    @Path("/cancelOrder")
    @Consumes(MediaType.APPLICATION_JSON)
    public String cancelOrder(Order order) {
        Customer customer = new Customer(order.getOrderId(), order.getCustomer().getBalance(), order.getCustomer().getName());

        int orderId = order.getOrderId();

        customer.cancelOrder(orderId);
        return "Order canceled successfully";
    }
}
