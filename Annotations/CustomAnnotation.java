import java.lang.annotation.*;


// Creating my custom Annotation

// Setting up some Meta-Annotations
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    // Annotation member
    String name() default "default value";
}



@MyAnnotation(name = "Tanveer")
public class CustomAnnotation {
}