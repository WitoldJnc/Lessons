package application.dao_interfaces;

import application.models.Discipline;
import application.models.SchoolGroup;
import application.models.Student;

import java.util.List;

public interface StudentDao {

    int insertStudent(Student student);

    void updateStudentName(int id, String newName);

    void updateStudentGroup(int studentId, int groupId);

    int getStudentCount();

    int getStudentId(String studentName);

    int getGroupCount(int goupId);

    void deleteStudentFromStudentListById(int id);

    Student getStudentById(int id);

    List<Student> getStudentListByName(String name);

    List<Student> getAllStudents();
}
