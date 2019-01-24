package application.dao_interfaces;

import application.models.Student;

import java.util.List;

public interface StudentDao extends GenericDao<Student>{

    void updateStudentName(int id, String newName);

    void updateStudentGroup(int studentId, int groupId);

    int findByName(String studentName);

    List<Student> findListByName(String name);

}
