package com.trade;

public class Account {
    private String id;
    private double totalValue;

    public Account(String id, double totalValue) {
        this.id = id;
        this.totalValue = totalValue;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "name='" + id + '\'' +
                ", account='" + totalValue + '\'' +
                '}';
    }

}
