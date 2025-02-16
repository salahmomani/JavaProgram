package part6.Heightorer;

import java.util.ArrayList;

public class Room {
    ArrayList <Person> persons=new ArrayList<>();

    public void add(Person person){
        persons.add(person);
    }
    public boolean isEmpty(){
        if(persons.isEmpty()){
            return true;
        }
        return  false;
    }
    public ArrayList<Person> getPersons(){
        return this.persons;
    }


}
