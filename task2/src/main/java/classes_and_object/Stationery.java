package classes_and_object;

public class Stationery {
    private int quantity;
    private int cost;

    public Stationery(int quantity, int cost) {
        this.quantity = quantity;
        this.cost = cost;
    }

    public Stationery() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}
