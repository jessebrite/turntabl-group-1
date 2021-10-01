import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class TradesTest {
    Trades trade = new Trades("aas", "aap", 12, -12.0);


    @Test
    @DisplayName("Should Not Accept Negative Numbers Ror Price")
    public void shouldTakePositivePrice() {
        assertTrue( trade.isPositive(trade.getPrice()));
    }
    @org.junit.jupiter.api.Test
    void setPrice() {
        assertEquals(2, 2);
    }
}