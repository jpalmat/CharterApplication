package com.chapter.application.jimmyapp.repository;

import com.chapter.application.jimmyapp.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}