package application.app;

import application.dao_impls.*;
import application.models.Mark;
import application.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component

public class AppController {

    private static final Logger logger = Logger.getLogger(AppController.class.getName());

    @Autowired
    private StudentDaoImpl studentDao;

    @Autowired
    private DisciplineDaoImpl disciplineDao;

    @Autowired
    private MarkDaoImpl markDao;

    @Autowired
    private SchoolGroupDaoImpl schoolGroupDao;

    @Autowired
    private GroupDisciplineDaoImpl groupDisciplineDao;

    @Bean
    public void process() {


    }
}
