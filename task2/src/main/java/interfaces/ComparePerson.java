package interfaces;


import java.util.Comparator;

public class ComparePerson {

    public static Comparator<Person> compareByAge = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
        }
    };

    public static Comparator<Person> compareByName = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Person> getCompareByNameAngAge = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            int i = o1.getName().compareTo(o2.getName());
            if (i == 0) {
                i = o1.getAge() - o2.getAge();
            }
            return i;
        }
    };

}
