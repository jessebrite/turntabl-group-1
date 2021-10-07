package com.trade;

public class Fund extends Trade {

    public Fund(String id, String symbol, int quantity) {
        super(id, symbol, quantity);
    }

    public Fund(String id, String symbol, int quantity, double price) {
        super(id, symbol, quantity, price);
    }

    @Override
    public double calcDividend() {
        return 0;
    }
}
