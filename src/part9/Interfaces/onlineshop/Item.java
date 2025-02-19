package part9.Interfaces.onlineshop;

public class Item {
String product;
int qty;
int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public Item(String product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public int price(){
        return this.qty*this.unitPrice;
    }
    public void increaseQuantity(){
        this.qty++;
    }
    public String toString(){
        return  this.product+":"+this.qty;
    }
}
