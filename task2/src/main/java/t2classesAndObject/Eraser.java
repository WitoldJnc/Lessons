package t2classesAndObject;

public class Eraser extends Stationery {
    private int fixedCost = 12;

    public Eraser(int quantity) {
        setCost(fixedCost);
        setQuantity(quantity);
    }

    public Eraser(int quantity, int cost) {
        super(quantity, cost);
    }
}
