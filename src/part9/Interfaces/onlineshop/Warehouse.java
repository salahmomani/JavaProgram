package part9.Interfaces.onlineshop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Warehouse {
HashMap<String, Integer> priceList;
    HashMap<String, Integer> stockList;

    public Warehouse() {
        this.priceList = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
this.priceList.put(product,price);
    }
    public int price(String product) {
        if (this.priceList.containsKey(product)) {
            return this.priceList.get(product);
        } else {
            return  -99;}
    }

    public int stock(String product){
        if (this.stockList.containsKey(product)) {
            return this.stockList.get(product);
        } else {
            return  0;}    }


    public boolean take(String product){


        if (this.stockList.containsKey(product)) {
            stockList.put(product,stockList.get(product)-1);
        return true;
        }
        return  false;
                
    }

    public Set<String> products()
    {
        return  stockList.keySet();
    }



    }

