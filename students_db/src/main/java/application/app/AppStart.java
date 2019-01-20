package application.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppStart {
    public static void main(String[] args) {
        AbstractApplicationContext context = new
                AnnotationConfigApplicationContext(ApplicationConfig.class);

        context.getBean(AppController.class);

    }
}
