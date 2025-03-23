package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface myInterface{
    String names();
}

public class Main {
    public static void main(String[] args) {
        Person p=new Student();
        p.print();

    }
    }
