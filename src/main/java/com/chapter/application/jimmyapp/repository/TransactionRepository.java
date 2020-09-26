package com.chapter.application.jimmyapp.repository;

import com.chapter.application.jimmyapp.model.Transactions;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface TransactionRepository extends CrudRepository<Transactions, Integer> {
    @Query("select t.transactionDate as date, SUM(t.point) as points from Transactions t where t.customer.id=:customerId group by t.transactionDate")
    public Map<String, Object> findByMonth(@Param("customerId") int customerId);
}
