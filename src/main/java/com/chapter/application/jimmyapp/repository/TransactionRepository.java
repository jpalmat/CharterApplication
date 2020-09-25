package com.chapter.application.jimmyapp.repository;

import com.chapter.application.jimmyapp.model.Transactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transactions, Integer> {
}
