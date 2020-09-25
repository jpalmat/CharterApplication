package com.chapter.application.jimmyapp.model;

import java.time.LocalDate;
import java.util.Date;

public class Transactions {
    private int id;
    private int customerId;
    private int point;
    private int purchase;
    private LocalDate transactionDate;

    public Transactions(int id, int customerId, int point, int purchase, LocalDate transactionDate) {
        this.id = id;
        this.customerId = customerId;
        this.point = point;
        this.purchase = purchase;
        this.transactionDate = transactionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getPurchase() {
        return purchase;
    }

    public void setPurchase(int purchase) {
        this.purchase = purchase;
    }
}