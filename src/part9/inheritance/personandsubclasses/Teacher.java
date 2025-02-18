package part9.inheritance.personandsubclasses;

public class Teacher extends  Person{
    double salary;
    public  Teacher(String name,String street,int salary){
        super(name,street);
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
