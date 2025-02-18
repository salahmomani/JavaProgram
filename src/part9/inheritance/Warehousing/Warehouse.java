package part9.inheritance.Warehousing;

import part9.inheritance.ABC.B;

public class Warehouse {

    double capacity;
    double Balance;
    public Warehouse(double capacity){
        if(capacity<=0)
        {
            capacity=0;
        }

        this.Balance= this.capacity=capacity;
    }

    public Double getCapacity() {
        return capacity;
    }

    public Double getBalance() {
        return Balance;
    }
    public double howMuchSpaceLeft(){
return  this.capacity-this.Balance;
    }

    public void addToWarehouse(double amount){
        if(amount>0) {
            if (this.Balance + amount < this.capacity) {
                this.Balance = this.Balance + amount;
            }
            else if(this.getBalance() + amount > this.Balance)
            {
                this.Balance=this.Balance;
            }
        }
   }
        public double takeFromWarehouse(double amount){
        this.Balance-=amount;
        return amount;
       }

    @Override
    public String toString() {
        return  "balance =" +this.getBalance()+","+"space left "+this.howMuchSpaceLeft();
    }
}
