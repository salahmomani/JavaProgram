package part9.polymorphism.Animals;

public class Cat extends  Animal implements  NoiseCapable{
    String name;

    public Cat(String name) {
        super(name);
    }
    public Cat(){

        super("Cat");
    }
    public  void purr(){
        System.out.println(this.getName()+" purr");
    }

    @Override
    public void makeNoise() {
          purr();
    }
}
