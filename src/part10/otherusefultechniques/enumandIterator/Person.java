package part10.otherusefultechniques.enumandIterator;

public class Person {


    String name;
Education education;
    public Person(String name,Education education) {
        this.name = name;
        this.education=education;
    }

    public Education getEducation(){
        return  education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", education=" + education +
                '}';
    }
}
