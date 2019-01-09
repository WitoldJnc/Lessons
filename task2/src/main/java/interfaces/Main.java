package interfaces;

public class Main {
    public static void main(String[] args) {

        PersonList personList = new PersonList();

        personList.getPeople().add(new Person("Denis", 21));
        personList.getPeople().add(new Person("Semen", 5));
        personList.getPeople().add(new Person("Max", 11));
        personList.getPeople().add(new Person("Denis", 32));
        personList.getPeople().add(new Person("Aygun", 46));
        personList.getPeople().add(new Person("Elena", 2));


        personList.sortByAge();
        personList.showinfo();

        personList.sortByName();
        personList.showinfo();

        personList.sortByNameAndAge();
        personList.showinfo();

    }
}
