package com.chapter.application.jimmyapp.service;

import com.chapter.application.jimmyapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <h1>TransactionService</h1>
 *  * * <p>
 *  *
 *  * @author Jimmy Palma
 *  * @version 1.0
 *  * @since   09-25-2020
 */
@Service
public class TransactionService {
    @Autowired
    private TransactionRepository TransactionRepository;

    public List<Map<String, Object>> findByMonth(int customerId){
        return TransactionRepository.findByMonth(customerId);
    }

    public Integer findTotal(int customerId){
        return TransactionRepository.findTotal(customerId);
    }
}