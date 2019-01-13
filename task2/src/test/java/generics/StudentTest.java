package generics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StudentTest {


    @Test
    public void testaverageMarkShouldReturnAverageMarkOfStudent() {

        Student student = new Student("student1");
        Group groupHisory = new Group(Discipline.HISTORY);
        Group groupEnglish = new Group(Discipline.ENGLISH);

        groupHisory.addStudent(student);
        groupEnglish.addStudent(student);

        student.addMark(groupHisory, 5);
        student.addMark(groupEnglish, 3.4);

        assertEquals(4.2, student.getAverageMark());
    }

    @Test
    public void testAddGroupShouldNotNull() {
        Student student = new Student("stident1");
        Student student2 = new Student("stident2");
        Group groupEnglish = new Group(Discipline.ENGLISH);

        groupEnglish.addStudent(student);
        groupEnglish.addStudent(student2);
        student.addMark(groupEnglish, 3.4);

        assertEquals(2, groupEnglish.getGroup().size());
        assertEquals(3.4, student.findMark(groupEnglish, 3.4));

    }

    @Test
    public void testAddMarkShoudReturnStudentMarkOfDiscipline() {
        Student student = new Student("student1");
        Group groupHisory = new Group(Discipline.HISTORY);

        groupHisory.addStudent(student);
        student.addMark(groupHisory, 5);


        assertEquals(5, student.findMark(groupHisory, 5));

    }


}