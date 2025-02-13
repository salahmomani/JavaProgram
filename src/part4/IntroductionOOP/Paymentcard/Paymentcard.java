package part4.IntroductionOOP.Paymentcard;

public class Paymentcard {
    private double balance;
    public Paymentcard(double balance)
    {
        this.balance=balance;
    }
public double PaymentCard(double openingBalance){
this.balance=openingBalance;
return this.balance;
}

    @Override
    public String toString() {
        return "The card has a balance of "+ balance +" euros";

    }
    public void eatAffordably() {
this.balance=this.balance-2.60;
if (this.balance<0)
{

    this.balance=this.balance+2.60;
}
    }

    public void eatHeartily() {
        this.balance=this.balance-4.60;
        if (this.balance<0)
        {

            this.balance=this.balance+4.60;
        }
    }
}
