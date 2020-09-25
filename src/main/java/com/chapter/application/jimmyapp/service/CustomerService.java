package com.chapter.application.jimmyapp.service;

import com.chapter.application.jimmyapp.model.Customer;
import com.chapter.application.jimmyapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllTransaction(){
        return customerRepository.getAllTransaction();
    }
}
