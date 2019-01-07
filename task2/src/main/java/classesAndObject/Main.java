package classesAndObject;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.getStationeries().add(new Pen(10, 14));
        employee1.getStationeries().add(new Eraser(5, 9));
        employee1.getStationeries().add(new Folder(2));

        employee2.getStationeries().add(new Pen(6, 15));
        employee2.getStationeries().add(new Eraser(12));
        employee2.getStationeries().add(new Folder(9, 12));


        System.out.println("employee1 all cost: " + employee1.allCost());
        System.out.println("employee2 all cost: " + employee2.allCost());

    }
}
