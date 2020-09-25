package com.chapter.application.jimmyapp.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
public class Transactions {
    @Id
    @GeneratedValue
    private Integer id;
    private int point;
    private int purchase;
    private LocalDate transactionDate;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    public Transactions() {
    }

    public Transactions(int point, int purchase, LocalDate transactionDate) {
        this.point = point;
        this.purchase = purchase;
        this.transactionDate = transactionDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transactions)) return false;
        Transactions that = (Transactions) o;
        return getPoint() == that.getPoint() &&
                getPurchase() == that.getPurchase() &&
                Objects.equals(getId(), that.getId()) &&
                Objects.equals(getTransactionDate(), that.getTransactionDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPoint(), getPurchase(), getTransactionDate());
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "id=" + id +
                ", point=" + point +
                ", purchase=" + purchase +
                ", transactionDate=" + transactionDate +
                '}';
    }
}