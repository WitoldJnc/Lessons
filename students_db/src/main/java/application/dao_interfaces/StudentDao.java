package application.dao_interfaces;

import application.models.Student;

import java.util.List;

public interface StudentDao {

    void updateStudentName(int id, String newName);

    void updateStudentGroup(int studentId, int groupId);

    int getStudentId(String studentName);

    List<Student> findByName(String name);

}
