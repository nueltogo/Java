public class Trader {
    private String name;
    Account account = new Account();

    public void addTrade(Trade trade){
        this.account.setTotalTrade(trade.getPrice() * trade.getQuantity());
    }
}
