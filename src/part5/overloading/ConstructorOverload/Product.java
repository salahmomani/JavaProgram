package part5.overloading.ConstructorOverload;

public class Product {
    String name;
    String location;
    int weight;
    public Product(String name){
this.name=name;
location="can be found from the shelf";
weight=1;

    }
    public Product(String name, String location){
        this.name=name;
        this.location=location;
        weight=1;
    }
    public Product(String name, int weight){
        this.name=name;
        this.weight=weight;
        location="can be found from the shelf";

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", weight=" + weight +
                '}';
    }
}
