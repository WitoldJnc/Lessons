package application.dao_interfaces;

public interface SchoolGroupDao {

    void updateGroupNumber(int groupId, int newGroupNumber);

    int getStudentCountInGroup(int groupId);

    int getGroupId(int groupNum);

}
