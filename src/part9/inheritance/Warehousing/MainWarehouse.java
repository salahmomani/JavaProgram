package part9.inheritance.Warehousing;

public class MainWarehouse {
    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getProductName());
        juice.addToWarehouse(1.0);
        System.out.println(juice);


        System.out.println(juice.history()); // [1000.0]
    }
}
