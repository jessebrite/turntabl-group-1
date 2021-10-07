package com.trade;

public class Trader {
    private String name;
    private Account account;

    public Trader(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public double addTrade(double price, int quantity){
        double value = price * quantity;
        value += account.getTotalValue();
        account.setTotalValue(value);

        return account.getTotalValue();
    }

    @Override
    public String toString() {
        return "Trade{" +
                "name='" + name + '\'' +
                ", account='" + account + '\'' +
                '}';
    }



}