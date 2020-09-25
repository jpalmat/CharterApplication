package com.chapter.application.jimmyapp.controller;

import com.chapter.application.jimmyapp.model.Customer;
import com.chapter.application.jimmyapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer/transactions")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping
    public List<Customer> getAllTransactions(@PathVariable("customerId") int customerId){
        return customerService.getAllTransaction();
    }

    @RequestMapping("/{customerId}")
    public List<Customer> getPointPerMotnh(@PathVariable("customerId") int customerId){
        return customerService.getAllTransaction();
    }
}