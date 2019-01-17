package application.dao_interfaces;

import application.models.StudentGroup;

import java.util.List;

public interface StudentGroupDao {

    void insertGroup(StudentGroup studentGroup);

    void updateStudentGroupID(int oldID, int newID);

    void deleteGroupById(int groupid);

    void deleteStudentFromGroupbyStudentId(int studentId);

    int getGroupCount();

    int getStudentCountInGroup(int groupid);

    StudentGroup getbyId(int id);

    List<StudentGroup> getGroupListByGroupId(int id);

    List<StudentGroup> getAllGroup();
}
