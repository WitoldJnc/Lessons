package application.services_impls;

import application.dao_interfaces.StudentGroupDao;
import application.models.StudentGroup;
import application.services_intertaces.StudentGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentGroupService")
public class StudentGroupServiceImpl implements StudentGroupService {

    @Autowired
   private StudentGroupDao studentGroupDao;


    @Override
    public void insert(StudentGroup studentGroup) {

        studentGroupDao.insertGroup(studentGroup);
    }

    @Override
    public void updateStudentGroupID(int oldID, int newID) {
        studentGroupDao.updateStudentGroupID(oldID, newID);

    }

    @Override
    public void deleteById(int groupId) {
        studentGroupDao.deleteGroupById(groupId);

    }

    @Override
    public void deleteStudentFromGroupbyStudentId(int studentId) {
        studentGroupDao.deleteStudentFromGroupbyStudentId(studentId);

    }


    @Override
    public int getCount() {
        return studentGroupDao.getGroupCount();
    }


    @Override
    public int getStudentCountInGroup(int groupid) {
        return studentGroupDao.getStudentCountInGroup(groupid);
    }


    @Override
    public StudentGroup getbyId(int id) {
        return studentGroupDao.getbyId(id);
    }


    @Override
    public List<StudentGroup> getGroupListByGroupId(int id) {
        return studentGroupDao.getGroupListByGroupId(id);
    }


    @Override
    public List<StudentGroup> getAll() {
        return studentGroupDao.getAllGroup();
    }
}
