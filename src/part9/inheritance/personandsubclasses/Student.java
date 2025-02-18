package part9.inheritance.personandsubclasses;

public class Student extends Person{
    int studyCounter;

    public Student(String name, String street) {
        super(name, street);
    }

    public  void study(){
studyCounter++;
    }
    public  int credits(){
        return  studyCounter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studyCounter=" + studyCounter +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
