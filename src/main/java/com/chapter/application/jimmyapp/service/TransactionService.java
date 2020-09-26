package com.chapter.application.jimmyapp.service;

import com.chapter.application.jimmyapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository TransactionRepository;

    public Object findByMonth(int customerId){
        return TransactionRepository.findByMonth(customerId);
    }
}