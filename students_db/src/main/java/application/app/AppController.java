package application.app;

import application.dao_interfaces.*;
import application.models.Mark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class AppController {

    private static final Logger logger = Logger.getLogger(AppController.class.getName());

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private DisciplinesDao disciplinesDao;

    @Autowired
    private MarkDao markDao;

    @Autowired
    private SchoolGroupDao schoolGroupDao;

    @Autowired
    private GroupDisciplineDao groupDisciplineDao;

    @Bean
    public void process() {
        System.out.println(markDao.getAllMarksByStudent(1));

    }
}
