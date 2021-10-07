package com.trade;

public class Bond extends Trade {
    public Bond(String id, String symbol, int quantity) {
        super(id, symbol, quantity);
    }

    public Bond(String id, String symbol, int quantity, double price) {
        super(id, symbol, quantity, price);
    }

    @Override
    public double calcDividend() {
        return 0;
    }
}
