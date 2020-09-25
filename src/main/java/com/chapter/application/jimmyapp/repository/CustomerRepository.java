package com.chapter.application.jimmyapp.repository;

import com.chapter.application.jimmyapp.model.Customer;
import com.chapter.application.jimmyapp.model.Transactions;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class CustomerRepository {
    List<Customer> transactionList = Arrays.asList(
            new Customer[]{
                    new Customer(1, "Jimmy", Arrays.asList(
                            new Transactions[]{
                                    new Transactions(1, 1, 90, 120, LocalDate.parse("2018-09-16")),
                                    new Transactions(2, 1, 90, 120, LocalDate.parse("2018-09-16"))
                            })),
                    new Customer(2, "Javier", Arrays.asList(
                            new Transactions[]{
                                    new Transactions(3, 2, 90, 120, LocalDate.parse("2018-09-16")),
                                    new Transactions(4, 2, 90, 120, LocalDate.parse("2018-09-16"))
                            }))
            });




    public List<Customer> getAllTransaction(){
        return transactionList;
    }

    public int getPointPerMotnh(int customerId){
        List<Transactions> transactions = transactionList.stream()
                .filter(x -> x.getId()==customerId)
                .map(x -> x.getTransactions())
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        

        return customerService.getAllTransaction();
    }
}
