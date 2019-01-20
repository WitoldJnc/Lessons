package application.services_impls;

import application.dao_interfaces.SchoolGroupDao;
import application.dao_interfaces.StudentDao;
import application.models.Student;
import application.services_intertaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private SchoolGroupDao schoolGroupDao;

    @Override
    public int insertStudent(String studentName, int groupNum) {
        return studentDao.insertStudent(new Student(studentName,
                schoolGroupDao.getGroupId(groupNum)));
    }

    @Override
    public void updateStudentName(int id, String newName) {
        studentDao.updateStudentName(id, newName);
    }

    @Override
    public void updateStudentGroup(int studentId, int groupNum) {
        studentDao.updateStudentGroup(studentId,
                schoolGroupDao.getGroupId(groupNum));
    }

    @Override
    public int getStudentCount() {
        return studentDao.getStudentCount();
    }

    @Override
    public int getGroupCount(int goupId) {
        return studentDao.getGroupCount(goupId);
    }

    @Override
    public int getStudentId(String studentName) {
        return studentDao.getStudentId(studentName);
    }

    @Override
    public void deleteStudentFromStudentListById(int id) {
        studentDao.deleteStudentFromStudentListById(id);
    }

    @Override
    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public List<Student> getStudentListByName(String name) {
        return studentDao.getStudentListByName(name);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
