package part9.inheritance.differentkindsofboxes;

public class MainBox {
    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));


//        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
//        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
//        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

    }
}
