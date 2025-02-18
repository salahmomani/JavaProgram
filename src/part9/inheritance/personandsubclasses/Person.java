package part9.inheritance.personandsubclasses;

import java.util.ArrayList;

public class Person {
    String name;
    String street;
public  Person(String name,String street){
    this.name=name;
    this.street=street;
}
    public static void printPersons(ArrayList<Person> persons){
for (Person p:persons)
{
    System.out.println(p.toString());
}
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
