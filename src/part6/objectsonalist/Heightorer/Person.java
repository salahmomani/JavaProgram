package part6.objectsonalist.Heightorer;


public class Person {


    private String name;
    private int age;
    private int weight;
    private int height;
    int count;


    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }


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

    public int getWeight() {
        return weight;
    }
    public void increaseweight(){
        this.weight=this.weight+1;
    }
    public void count(){
        count++;
    }
    @Override
    public String toString() {
        return this.name + ", age " + this.height + " years";
    }
}

