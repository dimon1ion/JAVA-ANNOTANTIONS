import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Repeatable(Mammals.class)
public @interface Mammal {
    int color();
    String sound() default "none";

}
