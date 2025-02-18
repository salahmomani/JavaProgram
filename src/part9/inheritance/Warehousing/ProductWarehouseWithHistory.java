package part9.inheritance.Warehousing;

import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    double initialBalance;
    String historylist="";
    ArrayList<String> list;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance)
    {
        super(productName,capacity);
        this.initialBalance=initialBalance;
    }
    public String history() {
        ChangeHistory changehistory = new ChangeHistory();
         return  "["+changehistory.history+"]";
    }
    public void addToWarehouse(double amount){

    }


}
