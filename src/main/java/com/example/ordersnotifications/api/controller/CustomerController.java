package com.example.ordersnotifications.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;

@RestController
public class CustomerController extends HttpServlet {


//    @PostMapping(value = "/signUp")
//    public String signUp(@RequestBody User user) {
//        return db.addNewUser(user);
//    }


    @GetMapping(value = "/profile")
    public String getCurUser() {
        return "hamoud";
    }

}

