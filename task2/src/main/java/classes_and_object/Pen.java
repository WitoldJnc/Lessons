package classes_and_object;

public class Pen extends Stationery {

    private int fixedCost = 7;

    public Pen(int quantity) {
        setCost(fixedCost);
        setQuantity(quantity);
    }

    public Pen(int quantity, int cost) {
        super(quantity, cost);
    }

}
