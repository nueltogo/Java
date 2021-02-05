public abstract class Trade {
    private String ID;
    private String Symbol;
    private int price;
    private int quantity;

    public Trade(String ID, String Symbol, int quantity){
        this.ID = ID;
        this.Symbol = Symbol;
        this.quantity = quantity;
    }

    public Trade(String ID, String Symbol, int price, int quantity){
        this.ID = ID;
        this.Symbol = Symbol;
        this.price = price;
        this.quantity = quantity;
    }

    abstract double calcDividend();

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        if(price >= 0)
            this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
        return "Trade Details\n" + "ID: "  + this.ID + "\n" + "Symbol: " + this.Symbol + "\n" + "price: " + this.price + "\n" + "quantity: " + this.quantity + "\n";
    }
}
