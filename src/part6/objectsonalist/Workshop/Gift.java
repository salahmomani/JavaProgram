package part6.objectsonalist.Workshop;

public class Gift {
String name;
int weight;
public  Gift(String name,int weight){
    this.name=name;
    this.weight=weight;
}
    public String getName(){return  this.name;}

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
