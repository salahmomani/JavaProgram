package part6.objectsonalist.Cargohold;

public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }

    public static void main(String[] args) {
        Item book = new Item("Book", 2);
        System.out.println(book);
      }
}

