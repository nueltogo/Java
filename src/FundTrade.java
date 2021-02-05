public class FundTrade extends Trade {
    private double divPercentage;

    public FundTrade(String ID, String Symbol, int price, int quantity, double divPercentage){
        super(ID, Symbol, price, quantity);
        this.divPercentage = divPercentage/100;
    }

    @Override
    double calcDividend() {
        return this.getPrice() * divPercentage;
    }
}
