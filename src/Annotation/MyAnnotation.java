package Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.TYPE,ElementType.FIELD})

@interface MyInterface{
    String names ();
}
@interface MyInterface2{
    String names () default "empty";
    int numbers() default 0;
}
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
@interface MyInterface3{
    String names ();
}

@MyInterface2(names="",numbers = -1)
class MyAnnotation {


}
