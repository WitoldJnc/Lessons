package interfaces;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonList {

    private List<Person> people = new ArrayList<>();

    public void showinfo() {
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public void sortByAge() {
        Collections.sort(people, ComparePerson.compareByAge);
    }

    public void sortByName() {
        Collections.sort(people, ComparePerson.compareByName);
    }

    public void sortByNameAndAge() {
        Collections.sort(people, ComparePerson.getCompareByNameAngAge);
    }

}
