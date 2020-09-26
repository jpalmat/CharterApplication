package com.chapter.application.jimmyapp.model.response;

import java.util.List;

/**
 * <h1>CustomerResponse</h1>
 *  * Response class for the services
 *  * * <p>
 *  *
 *  * @author Jimmy Palma
 *  * @version 1.0
 *  * @since   09-25-2020
 */
public class CustomerResponse{

    private String name;
    private List<TransactionResponse> transactionResponses;

    public CustomerResponse(String name, List<TransactionResponse> transactionResponses) {
        this.name = name;
        this.transactionResponses = transactionResponses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TransactionResponse> getTransactionResponses() {
        return transactionResponses;
    }

    public void setTransactionResponses(List<TransactionResponse> transactionResponses) {
        this.transactionResponses = transactionResponses;
    }
}