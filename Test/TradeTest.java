import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    @org.junit.jupiter.api.Test
    void setPrice() {
        int min = 0;
        Trade atrade = new Trade("fise", "sawe", 20);
        atrade.setPrice(-5);

        assertEquals(atrade.getPrice(),  -5);

    }
}