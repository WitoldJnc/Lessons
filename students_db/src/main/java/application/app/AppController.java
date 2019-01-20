package application.app;

import application.services_intertaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component

public class AppController {

    private static final Logger logger = Logger.getLogger(AppController.class.getName());

    @Autowired
    private StudentService studentService;

    @Autowired
    private DisciplineService disciplineService;

    @Autowired
    private SchoolGroupService studentGroupService;

    @Autowired
    private GroupDisciplineService groupDisciplineService;

    @Autowired
    private MarkService markService;

    @Bean
    public void process() {

        /**
         * create and insert this in db
         */
        disciplineService.insertDiscipline("Geometry");

        logger.info("disciplines  count: " + disciplineService.getCount());

        logger.info("all disciplines info: " + disciplineService.getAllDisciplines());

        /**
         * change discipline name by id of "geometry" disciplines
         */
        disciplineService.updateDisciplineName(
                disciplineService.getDisciplineIdByName("Geom"), "Bology");

        /**
         * delete discipline by id where the discipline name refers to the discipline id
         */
        disciplineService.deleteDisciplineByName("Fren");

        /**
         * create and insert group into grouplist
         */
        studentGroupService.insertGroup(321);
        studentGroupService.insertGroup(542);

        logger.info("all group" + studentGroupService.getAllGroup());

        /**
         * change group number by group id
         */
        studentGroupService.updateGroupNumber(2470, 1470);

        logger.info("all group" + studentGroupService.getAllGroup());

        /**
         * mapping group and discipline by id
         */
        groupDisciplineService.insertGroupDiscipline(542, "Russian");

        /**
         * prin count groups with "russian" dicipline
         */
        logger.info("groups with Russian discipline: " + groupDisciplineService.getGroupCountByDiscipline("Russi"));

        /**
         * create and insert new student in group 1470
         */
        studentService.insertStudent("Vadim", 1470);

        logger.info("stdent count in 1470 group: " + studentService.getGroupCount(
                studentGroupService.getGroupId(1470)));

        logger.info("all students count:" + studentService.getStudentCount());

        /**
         * update group number for student
         */
        studentService.updateStudentGroup(
                studentService.getStudentId("Vadim"),
                1510);

        logger.info("all students: " + studentService.getAllStudents());

        markService.insertMark(5, "English", 5);

        logger.info("All mark by Russian discipline: " + markService.getAllMarksByDiscipline("Russian"));

        logger.info("Average mark by Russian discipline: " +
                markService.getDisciplineAverageMark("Russian"));

        logger.info("All marks" + markService.getAllMakrs());
    }
}
