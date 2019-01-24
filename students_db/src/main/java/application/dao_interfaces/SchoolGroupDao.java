package application.dao_interfaces;

import application.models.SchoolGroup;

public interface SchoolGroupDao extends GenericDao<SchoolGroup>{

    void updateGroupNumber(int groupId, int newGroupNumber);

    int getStudentCountInGroup(int groupId);

    int getGroupId(int groupNum);

}
