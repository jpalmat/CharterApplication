package com.chapter.application.jimmyapp.controller;

import com.chapter.application.jimmyapp.model.Customer;
import com.chapter.application.jimmyapp.model.TransactionResponse;
import com.chapter.application.jimmyapp.model.Transactions;
import com.chapter.application.jimmyapp.service.CustomerService;
import com.chapter.application.jimmyapp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
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

    @RequestMapping("/{customerId}")
    public TransactionResponse getPointPerMotnh(@PathVariable("customerId") int customerId){
        Map<String, Object> transactionCustomer = transactionService.findByMonth(customerId);
        LocalDate date = (LocalDate) transactionCustomer.get("date");
        TransactionResponse response = new TransactionResponse(date.getMonth().name(), transactionCustomer.get("points"));

        return response;
    }
}

class PointPerMonth{

}