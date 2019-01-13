package generics;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("stud1");
        Student student2 = new Student("stud2");
        Student student3 = new Student("stud3");
        Student student4 = new Student("stud4");

        Group groupEnglish = new Group(Discipline.ENGLISH);
        Group groupRussian = new Group(Discipline.RUSSIAN);
        Group groupHistory = new Group(Discipline.HISTORY);

        groupEnglish.addStudent(student1);
        groupEnglish.addStudent(student2);
        groupEnglish.addStudent(student3);

        groupRussian.addStudent(student1);
        groupRussian.addStudent(student3);

        groupHistory.addStudent(student1);
        groupHistory.addStudent(student4);
        groupHistory.addStudent(student3);

        student1.addMark(groupEnglish, 3.3);
        student2.addMark(groupEnglish, 7.2);
        student3.addMark(groupEnglish, 7.2);


        student1.addMark(groupRussian, 9);
        student3.addMark(groupRussian, 4);
        student2.addMark(groupRussian, 4);

        student1.addMark(groupHistory, 6);
        student4.addMark(groupHistory, 3);
        student3.addMark(groupHistory, 8);


//        System.out.println(student1.getGroupList() + "  stud1 all marks");
//        System.out.println(student3.getGroupList() + "  stud3 all marks" );
//        System.out.println();
//        System.out.println(student1.getAverageMark() + "  stud1 average mark");







    }
}
