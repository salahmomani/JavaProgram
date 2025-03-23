import java.lang.annotation.*;
@MyAnnotation("Hello, Annotations!")
class Demo { }
public class Main {
    public static void main(String[] args) {
//
//            Student student = new Student("Kenny", 23, 140);
//
//            Person person = student;
//            Object object = student;
//
//            System.out.print(student + ", ");
//            System.out.print(person + ", ");
//            System.out.println(object);
        Runnable runnable = () -> System.out.println("I am running");

        Class<Demo> obj = Demo.class;
        Annotation annotation = obj.getAnnotation(MyAnnotation.class);

        if (annotation instanceof MyAnnotation myAnno) {
            System.out.println("Annotation value: " + myAnno.value());
        }
    }
}