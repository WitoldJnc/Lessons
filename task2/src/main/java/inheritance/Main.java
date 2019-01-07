package inheritance;

public class Main {
    public static void main(String[] args) {

        Novice novice1 = new Novice();

        novice1.setStationeryList(new NovicePack().getNovicesStationery());
        novice1.printInfo();

    }

}