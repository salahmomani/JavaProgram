package part9.polymorphism.Animals;

public class Dog extends  Animal implements NoiseCapable{
String name;


    public Dog(String name) {
        super(name);
    }
    public Dog(){

        super("Dog");
    }
    public  void bark(){
        System.out.println(this.getName()+" bark");



    }

    @Override
    public void makeNoise() {
bark();
    }
}
