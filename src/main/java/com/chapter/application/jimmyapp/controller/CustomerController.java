package com.chapter.application.jimmyapp.controller;

import com.chapter.application.jimmyapp.model.Customer;
import com.chapter.application.jimmyapp.model.Transactions;
import com.chapter.application.jimmyapp.service.CustomerService;
import com.chapter.application.jimmyapp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer/transactions")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<Customer> getAllTransactions(@PathVariable("customerId") int customerId){
        List<Customer> a = customerService.getAllTransaction();
        return customerService.getAllTransaction();
    }

    @RequestMapping("/{customerId}")
    public Object getPointPerMotnh(@PathVariable("customerId") int customerId){
//        Customer customer = customerService.getCustomerById(customerId);
//        List<Transactions> transactions = customer.getTransactions();
        Object a = transactionService.findByMonth(customerId);


        return a;
    }
}

class PointPerMonth{

}