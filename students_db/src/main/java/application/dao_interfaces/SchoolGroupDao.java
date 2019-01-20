package application.dao_interfaces;

import application.models.SchoolGroup;

import java.util.List;

public interface SchoolGroupDao {

    int insertGroup(SchoolGroup studentGroup);

    void updateGroupNumber(int groupId, int newGroupNumber);

    void deleteGroupById(int groupid);

    int getGroupCount();

    int getStudentCountInGroup(int groupId);

    int getGroupId(int groupNum);

    SchoolGroup getbyId(int id);

    List<SchoolGroup> getAllGroup();
}
