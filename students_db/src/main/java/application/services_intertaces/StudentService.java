package application.services_intertaces;

import application.models.Student;

import java.util.List;

public interface StudentService extends GenericService<Student> {


    void updateStudentName(int id, String newName);

    List<Student> getStudentListByName(String name);


}
