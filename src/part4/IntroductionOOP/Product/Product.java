package part4.IntroductionOOP.Product;

public class Product {
    String name;
    double price;
    int quantity;
    public Product (String initialName, double initialPrice, int initialQuantity)
    {
        name=initialName;
        price=initialPrice;
        quantity=initialQuantity;

    }
    public void printProduct(){
        System.out.println(name+","+"price:"+price+","+"quantity"+quantity);
    }

}
