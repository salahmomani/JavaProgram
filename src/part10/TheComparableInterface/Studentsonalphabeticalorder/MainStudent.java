package part10.TheComparableInterface.Studentsonalphabeticalorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie"));
        students.add(new Student("Alice"));
        students.add(new Student("Bob"));
        students.add(new Student("David"));

        Collections.sort(students);

        System.out.println("Students sorted by name (A-Z):");
        students.forEach(System.out::println);
    }
}
