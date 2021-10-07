package com.trade;

public class Bond extends Trade {

    private final double annualDivPaidPerShare;
    private final double pricePerShare;

    public Bond(double annualDivPaidPerShare, double pricePerShare) {
        this.annualDivPaidPerShare = annualDivPaidPerShare;
        this.pricePerShare = pricePerShare;
    }

    /**public Bond(String id, String symbol, int quantity) {
        super(id, symbol, quantity);
    }

    public Bond(String id, String symbol, int quantity, double price) {
        super(id, symbol, quantity, price);
    }*/

    @Override
    public double calcDividend() {
        return annualDivPaidPerShare / pricePerShare;
    }
}
