package inheritance;

import java.util.ArrayList;
import java.util.List;

public class NovicePack {

    private List<Stationery> novicesStationery = new ArrayList<>();

    public NovicePack() {
        createNovicepack();
    }


    public void createNovicepack() {
        novicesStationery.add(new Pen(4));
        novicesStationery.add(new Folder(6));
        novicesStationery.add(new Notepade(1));
        novicesStationery.add(new Pencil(9));
    }


    public List<Stationery> getNovicesStationery() {
        return novicesStationery;
    }

    public void setNovicesStationery(List<Stationery> novicesStationery) {
        this.novicesStationery = novicesStationery;
    }
}