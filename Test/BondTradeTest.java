import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BondTradeTest {
    BondTrade trade1 = new BondTrade("fise", "sawe", 20, 15, 51.3);

    @Test
    void calcDividend() {
        assertTrue(51.3 == trade1.calcDividend());
    }
}