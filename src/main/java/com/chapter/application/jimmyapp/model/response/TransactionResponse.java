package com.chapter.application.jimmyapp.model.response;

public class TransactionResponse {
    private String name;
    private Object points;

    public TransactionResponse(String name, Object points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getPoints() {
        return points;
    }

    public void setPoints(Object points) {
        this.points = points;
    }
}
