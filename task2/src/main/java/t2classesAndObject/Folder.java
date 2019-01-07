package t2classesAndObject;

public class Folder extends Stationery {

    private int fixedCost = 18;

    public Folder(int quantity) {
        setCost(fixedCost);
        setQuantity(quantity);
    }

    public Folder(int quantity, int cost) {
        super(quantity, cost);
    }

}
