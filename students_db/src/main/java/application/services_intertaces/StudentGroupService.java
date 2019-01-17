package application.services_intertaces;

import application.models.StudentGroup;

import java.util.List;

public interface StudentGroupService extends GenericService<StudentGroup> {

    List<StudentGroup> getGroupListByGroupId(int id);

    void deleteStudentFromGroupbyStudentId(int id);

    int getStudentCountInGroup(int groupid);

    void updateStudentGroupID(int oldID, int newID);
}
