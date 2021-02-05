import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundTradeTest {
    FundTrade trade1 = new FundTrade("fise", "sawe", 20, 15, 51.3);
    @Test
    void calcDividend() {
        assertEquals((51.3/100)*20, trade1.calcDividend());
    }
}