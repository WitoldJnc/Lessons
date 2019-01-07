package t6classesNotepade;

public class Main {
    public static void main(String[] args) {
        Notepade n1 = new Notepade(3);
        n1.addNote("allah is");
        n1.addNote("our");
        n1.addNote("god");

        n1.showInfo();


        n1.delNote(2);
        n1.editNote(2, "shaper");
        n1.showInfo();

    }
}