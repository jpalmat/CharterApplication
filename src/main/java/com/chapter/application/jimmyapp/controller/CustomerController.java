package com.chapter.application.jimmyapp.controller;

import com.chapter.application.jimmyapp.model.Customer;
import com.chapter.application.jimmyapp.model.response.CustomerResponse;
import com.chapter.application.jimmyapp.model.response.TransactionResponse;
import com.chapter.application.jimmyapp.service.CustomerService;
import com.chapter.application.jimmyapp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/getPointPerMotnh/{customerId}")
    public CustomerResponse getPointPerMotnh(@PathVariable("customerId") int customerId){
        Customer customer = customerService.getCustomerById(customerId);

        CustomerResponse responseC = new CustomerResponse(customer.getName(), getTransactions(transactionService.findByMonth(customerId)));

        return responseC;
    }

    private List<TransactionResponse> getTransactions(List<Map<String, Object>> byMonth) {
        List<TransactionResponse> list = new ArrayList<>();
        for (Map<String, Object> map: byMonth) {
            LocalDate date = (LocalDate) map.get("date");
            list.add(new TransactionResponse(date.getMonth().name(), map.get("points")));
        }

        return list;
    }

    @RequestMapping("/getPointTotal/{customerId}")
    public CustomerResponse getPointTotal(@PathVariable("customerId") int customerId){
        List<TransactionResponse> list = new ArrayList<>();

        Customer customer = customerService.getCustomerById(customerId);
        Integer transactionCustomer = transactionService.findTotal(customerId);
        list.add(new TransactionResponse("total", transactionCustomer));

        CustomerResponse responseC = new CustomerResponse(customer.getName(), list);

        return responseC;
    }
}