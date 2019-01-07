package oopBasics;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen(PenMaterial.PLASITC, LnkColor.RED, Construction.BALLPOINT);
        Pen pen2 = new Pen(PenMaterial.PLASITC, LnkColor.RED, Construction.BALLPOINT);

        pen1.hashCode();   //pen1 hashcode equal pen2 hashcode
        pen2.hashCode();
        pen1.equals(pen1);  //true
        pen1.equals(pen2);  //true

        pen1.setConstruction(Construction.FOUNTAIN);
        pen1.hashCode();   //hashcode different from previous pen1 constructors set
        pen1.equals(pen2);  //false

        pen1.toString();

    }

}
