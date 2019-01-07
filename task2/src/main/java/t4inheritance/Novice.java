package t4inheritance;

import java.util.ArrayList;
import java.util.List;

public class Novice {
    private List<Stationery> stationeryList = new ArrayList<>();


    public void printInfo() {
        for (Stationery stationery : stationeryList)
            System.out.println(stationery.toString());
    }

    public List<Stationery> getStationeryList() {
        return stationeryList;
    }

    public void setStationeryList(List<Stationery> stationeryList) {
        this.stationeryList = stationeryList;
    }
}