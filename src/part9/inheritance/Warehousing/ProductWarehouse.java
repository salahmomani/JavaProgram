package part9.inheritance.Warehousing;

import java.util.ArrayList;

public class ProductWarehouse extends Warehouse {
    String productName;

    public ProductWarehouse(String productName, double capacity)
    {
        super(capacity);
        this.productName=productName;
    }
    public void setName(String newName){
        this.productName=newName;
    }
    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return this.productName+": Balance= "+this.Balance+", space left "+howMuchSpaceLeft();
    }
}
