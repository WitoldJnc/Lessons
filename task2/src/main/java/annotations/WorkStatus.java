package annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.METHOD)
public @interface WorkStatus {

    boolean engineWorkStatus() default false;

}
