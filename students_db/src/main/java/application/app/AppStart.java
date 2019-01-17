package application.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppStart {
    public static void main(String[] args) {
        AbstractApplicationContext context = new
                AnnotationConfigApplicationContext(ApplicationConfig.class);

//        context.getBean(AppController.class).processStudentService();

//        context.getBean(AppController.class).processDisciplineService();
//
//        context.getBean(AppController.class).processStudentGroupService();

//        context.getBean(AppController.class).processMarkService();


    }
}
