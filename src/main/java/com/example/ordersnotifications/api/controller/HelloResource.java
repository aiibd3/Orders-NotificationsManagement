package com.example.ordersnotifications.api.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/helloWorld")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hamoud";
    }
}