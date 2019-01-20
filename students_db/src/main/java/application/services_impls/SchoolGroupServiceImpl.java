package application.services_impls;

import application.dao_interfaces.SchoolGroupDao;
import application.models.SchoolGroup;
import application.services_intertaces.SchoolGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentGroupService")
public class SchoolGroupServiceImpl implements SchoolGroupService {

    @Autowired
    private SchoolGroupDao studentGroupDao;

    @Override
    public int insertGroup(int groupNum) {
        return studentGroupDao.insertGroup(new SchoolGroup(groupNum));
    }

    @Override
    public void updateGroupNumber(int groupNumber, int newGroupnumber) {
        studentGroupDao.updateGroupNumber(
                studentGroupDao.getGroupId(groupNumber), newGroupnumber);
    }

    @Override
    public void deleteGroupById(int groupid) {
        studentGroupDao.deleteGroupById(groupid);
    }

    @Override
    public void deleteGroupByNumber(int groupNumber) {
        studentGroupDao.deleteGroupById(studentGroupDao.getGroupId(groupNumber));
    }

    @Override
    public int getGroupCount() {
        return studentGroupDao.getGroupCount();
    }

    @Override
    public int getStudentCountInGroup(int groupId) {
        return studentGroupDao.getStudentCountInGroup(groupId);
    }

    @Override
    public int getGroupId(int groupNum) {
        return studentGroupDao.getGroupId(groupNum);
    }

    @Override
    public SchoolGroup getbyId(int id) {
        return studentGroupDao.getbyId(id);
    }

    @Override
    public List<SchoolGroup> getAllGroup() {
        return studentGroupDao.getAllGroup();
    }
}
