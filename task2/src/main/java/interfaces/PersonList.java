package interfaces;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonList {

    private List<Person> people = new ArrayList<>();

    public void showinfo() {
        people.forEach(System.out::println);
        System.out.println();
    }

    public List<Person> getPeople() {
        return people;
    }


    public void sortByAge() {
        people.sort(((o1, o2) -> o1.getAge() - o2.getAge()));
    }

    public void sortByName() {
        people.sort((((o1, o2) -> o1.getName().compareTo(o2.getName()))));
    }

    public void sortByNameAndAge(){
        people.sort((o1, o2) -> {
            if(o1.getName().compareTo(o2.getName()) ==0){
                return o1.getAge() - o2.getAge();
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }


}
