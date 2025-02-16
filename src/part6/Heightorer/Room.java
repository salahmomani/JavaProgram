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
    public Person shortest(){
        if(persons.isEmpty()){return null;}
        Person shortest=persons.get(0);
        for (Person p:persons)
        {
            if(p.getHeight()<shortest.getHeight()){
                shortest=p;

            }
        }
        return shortest;
    }
    public Person take(){
        Person per=shortest();
        persons.remove(per );
        return per;
    }
}
