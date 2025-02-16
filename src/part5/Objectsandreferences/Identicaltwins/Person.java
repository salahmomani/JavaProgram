package part5.Objectsandreferences.Identicaltwins;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
SimpleDate sd;


    public Person(String name, SimpleDate simple,int weight,int height) {
        this.name = name;
        this.weight = weight;
        this.sd=simple;
        this.height=height;
    }

    // other constructors and methods

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public boolean equals (SimpleDate sd1){
        if(this.sd.toString().equals(sd1.toString())){return true;}
        return false;
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
