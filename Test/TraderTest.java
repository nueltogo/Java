import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {

    @Test
    void addTrade() {
        Trader Kofi = new Trader();
        Trade trade1 = new Trade("fise", "sawe", 20, 40);
        Kofi.addTrade(trade1);

        assertTrue(Kofi.account.getTotalTrade() == 20*40);
    }
}