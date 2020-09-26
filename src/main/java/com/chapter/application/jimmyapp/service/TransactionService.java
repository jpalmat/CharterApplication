package com.chapter.application.jimmyapp.service;

import com.chapter.application.jimmyapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository TransactionRepository;

    public Map<String, Object> findByMonth(int customerId){
        return TransactionRepository.findByMonth(customerId);
    }
}