package com.example.springwebdemo01.api.controller;

import com.example.springwebdemo01.business.CustomerManager;
import com.example.springwebdemo01.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class CustomerController {

    private CustomerManager customerManager;

    public CustomerController(CustomerManager customerManager) {
        this.customerManager = customerManager;
    }

    @RequestMapping("/api")
    public String getAll(){
        return "getAll";
    }

    @GetMapping("/aaa")
    public List<Customer> get(){
        return customerManager.ge
    }

}
