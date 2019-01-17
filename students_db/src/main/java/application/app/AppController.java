package application.app;

import application.models.Disciplines;
import application.models.Marks;
import application.models.Student;
import application.models.StudentGroup;
import application.services_intertaces.DisciplineService;
import application.services_intertaces.MarkService;
import application.services_intertaces.StudentGroupService;
import application.services_intertaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppController {


    @Autowired
    private StudentService studentService;

    @Autowired
    private DisciplineService disciplineService;

    @Autowired
    private StudentGroupService studentGroupService;

    @Autowired
    private MarkService markService;

    private  Student student1 = Student.createStudent("Evgeniy", 10);
    private  Student student2 = Student.createStudent("Arkadiy", student1.getId() + 1);

    private Disciplines disciplineMath = Disciplines.createDiscipline(3, "Math");
    private Disciplines disciplinesGeometry = Disciplines.createDiscipline(4, "Geometry");

    private StudentGroup group3 = StudentGroup.createGroup(3, student1.getId(), disciplineMath.getId());

    Marks makForStudentId1 = Marks.createMark(2, 2, 6);

    public void processStudentService() {

        studentService.insert(student1);
        System.out.println(student1.getName() + " are added into studentlist");

        studentService.insert(student2);
        System.out.println(student2.getName() + " are added into studentlist");

        studentService.updateStudentName(8, "Vavilen");

        System.out.println(studentService.getCount() + "all student count");

        System.out.println(studentService.getbyId(4));

        System.out.println(studentService.getCount());

        studentService.deleteById(9);

        System.out.println(studentService.getAll());

    }

    public void processDisciplineService() {


        disciplineService.insert(disciplineMath);
        System.out.println(disciplineMath.getName() + " discipline are added");

        disciplineService.insert(disciplinesGeometry);
        System.out.println(disciplinesGeometry.getName() + " discipline are added");

        disciplineService.updateDisciplineName(disciplineMath.getId(), "English");

        System.out.println(disciplineService.getCount());

        System.out.println(disciplineService.getbyId(2));

        System.out.println(disciplineService.getAll());

    }

    public void processStudentGroupService(){

        studentGroupService.insert(group3);

        System.out.println(studentGroupService.getAll());

        studentGroupService.updateStudentGroupID(1, 327);

        studentGroupService.deleteStudentFromGroupbyStudentId(10);

        System.out.println(studentGroupService.getGroupListByGroupId(2));

        System.out.println(studentGroupService.getStudentCountInGroup(327));

    }

    public void processMarkService(){

        System.out.println(markService.getAll());

        System.out.println(markService.getAllMarksByDiscipline(1));

        markService.insert(makForStudentId1);

        System.out.println(markService.getAllMarksByStudent(1));

        System.out.println(markService.getAverageMarkByStudent(1));

        System.out.println(markService.getDisciplineAverageMark(2));

        markService.deleteById(4);
    }
}
