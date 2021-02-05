public class BondTrade extends Trade {
    private double dividend;

    public BondTrade(String ID, String Symbol, int price, int quantity, double dividend){
        super(ID, Symbol, price, quantity);
        this.dividend = dividend;
    }

    @Override
    double calcDividend() {
        return dividend;
    }

}
