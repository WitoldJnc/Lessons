package generics;

import java.util.HashSet;
import java.util.Set;

public class Group {

    private Discipline subject;
    private Set<Student> group = new HashSet<>();

    public Group(Discipline subject) {
        this.subject = subject;
    }


    public Discipline getSubject() {
        return subject;
    }

    public Set<Student> getGroup() {
        return group;
    }


    public void addStudent(Student student) {
        group.add(student);
        student.addGroup(this);
    }


    @Override
    public String toString() {
        return  subject + " ";


    }
}