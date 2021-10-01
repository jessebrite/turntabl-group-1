package com.trade;


public class Main {

    public static void main(String[] args) {
       Trade trade1 = new Trade("1", "IBM", 8);
        Trade trade2 = new Trade("1", "IBM", 8, -10.2);
        System.out.println(trade1);
        System.out.println("And the one with price");
        System.out.println(trade2);
    }
}
