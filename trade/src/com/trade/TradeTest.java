package com.trade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    Trade trade = new Trade("aas", "aap", 12, -12.0);

    @Test
    @DisplayName("Should Not Accept Negative Numbers Ror Price")
   public void shouldTakePositivePrice() {
        trade.setPrice(-500);
       assertTrue( trade.isPositive(trade.getPrice()));
   }
    @org.junit.jupiter.api.Test
    void setPrice() {
        assertEquals(2, 2);
    }
}