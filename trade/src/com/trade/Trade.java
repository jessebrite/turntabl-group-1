package com.trade;

public abstract class Trade {
    private final String id;
    private final String symbol;
    private int quantity;
    private double price;

    public Trade(){
        this("T1", "APPL", 100, 15.25);
    }

    public Trade(String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public abstract double calcDividend();

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException();
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPositive(double price) {
        return getPrice() > 0;
    }


    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
