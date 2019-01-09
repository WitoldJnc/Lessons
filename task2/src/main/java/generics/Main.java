package generics;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("stud1");
        Student student2 = new Student("stud2");
        Student student3 = new Student("stud3");
        Student student4= new Student("stud4");

        Group group = new Group(Discipline.ENGLISH);
        group.addStudent(student1);
        group.addStudent(student2);
        student1.setRating(group, 3.6);
        student2.setRating(group, 7.2);



        Group group1 = new Group(Discipline.RUSSIAN);
        group1.addStudent(student1);
        group1.addStudent(student3);
        student1.setRating(group1, 5);
        student3.setRating(group1, 4);

        Group group2 = new Group(Discipline.HISTORY);
        group2.addStudent(student1);
        group2.addStudent(student4);
        group2.addStudent(student3);
        student1.setRating(group2, 6);
        student4.setRating(group2, 3);
        student3.setRating(group2, 8);


        System.out.println(student1.getMarksBySubject());

    }
}
