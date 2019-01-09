package inheritance;

public class Stationery {

    private int quantity;

    public Stationery(int quantity) {
        this.quantity = quantity;
    }

    public Stationery() {

    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + getQuantity();
    }

}
