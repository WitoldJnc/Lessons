package generics;

import java.util.HashSet;
import java.util.Set;

public class Group {

    private Discipline subject;
    private Set<Student> students = new HashSet<Student>();

    public Group(Discipline subject) {
        this.subject = subject;
    }


    public Discipline getSubject() {
        return subject;
    }


    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addGroup(this);
        }
    }
}