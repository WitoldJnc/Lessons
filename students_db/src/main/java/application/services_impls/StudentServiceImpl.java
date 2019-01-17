package application.services_impls;

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


    @Override
    public void insert(Student student) {
        studentDao.insertStudent(student);
    }


    @Override
    public void updateStudentName(int id, String newName) {
        studentDao.updateStudentName(id, newName);
    }


    @Override
    public int getCount() {
        return studentDao.getStudentCount();
    }

    @Override
    public void deleteById(int id) {
        studentDao.deleteStudentFromStudentListById(id);

    }

    @Override
    public Student getbyId(int id) {
        return studentDao.getStudentById(id);
    }


    @Override
    public List<Student> getStudentListByName(String name) {
        return studentDao.getStudentListByName(name);
    }


    @Override
    public List<Student> getAll() {
        return studentDao.getAllStudents();
    }

}
