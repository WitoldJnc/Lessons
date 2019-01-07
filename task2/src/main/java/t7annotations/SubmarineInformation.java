package t7annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface SubmarineInformation {
    int weight() default 0;

    String color() default "black";

    boolean sanctify() default true;
}
