package part10.TheComparableInterface.Studentsonalphabeticalorder;

public class Student implements Comparable<Student>{

String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name); // Sort alphabetically

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
