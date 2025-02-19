package part9.Interfaces.onlineshop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

                ArrayList<Item> shoppingCartList;

    public ShoppingCart() {
 shoppingCartList=new ArrayList<>();
    }

    public void add(String product, int price){
        Item i =new Item(product,price);
        shoppingCartList.add(i);
    }
    public int price(){
        int totalPrice=0;
   for (Item  i:shoppingCartList)
   {
       totalPrice+=i.price();
   }
   return totalPrice;
    }

    public void print(){
        for (Item  i:shoppingCartList)
        {

            System.out.println(i);        }
    }
}
