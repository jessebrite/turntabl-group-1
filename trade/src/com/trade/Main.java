package com.trade;


public class Main {

    public static void main(String[] args) {
        Trade trade1 = new Fund("1", "IBM", 8, 2);
        /**Trade trade2 = new Trade("1", "IBM", 8, 10.2);
        System.out.println(trade1);
        System.out.println("And the one with price");*/
        System.out.println(trade1);

        Account account = new Account("12345", 2.7);

        /**System.out.println("Before trade:");
        Trader trader = new Trader("Bright & Sons", account);
        System.out.println(trader);

        System.out.println("After trade:");
        trader.addTrade(trade.getPrice(), trade.getQuantity());

        System.out.println(trade2);*/

        Trade trade = new Bond(40,6.9);
        System.out.println(trade.calcDividend());
    }
}
