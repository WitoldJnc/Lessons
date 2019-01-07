package t2classesAndObject;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private List<Stationery> stationeries = new ArrayList<>();

    public int allCost() {
        int result = 0;
        for (Stationery stationery : stationeries) {
            result += stationery.getCost() * stationery.getQuantity();

        }
        return result;
    }

    public List<Stationery> getStationeries() {
        return stationeries;
    }

    public void setStationeries(List<Stationery> stationeries) {
        this.stationeries = stationeries;
    }
}
