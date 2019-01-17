package application.dao_interfaces;

import application.models.Student;

import java.util.List;

public interface StudentDao {

    void insertStudent(Student student);

    void updateStudentName(int id, String newName);

    int getStudentCount();

    void deleteStudentFromStudentListById(int id);

    Student getStudentById(int id);

    List<Student> getStudentListByName(String name);

    List<Student> getAllStudents();
}
