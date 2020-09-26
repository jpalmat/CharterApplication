package com.chapter.application.jimmyapp.service;

import com.chapter.application.jimmyapp.model.Customer;
import com.chapter.application.jimmyapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllTransaction(){
        return (List<Customer>) customerRepository.findAll();
    }

    public Customer getCustomerById(Integer customerId){
        Optional<Customer> customer = customerRepository.findById(customerId);
        return customer.isPresent() ? customer.get() : new Customer();
    }
}
