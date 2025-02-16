package part5.Objectsandreferences.Money;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    public Money plus(Money addition) {
        int neweuro= this.euros+addition.euros;
        int newcente= this.cents+addition.cents;

        if(addition.cents>=100)
        {
                newcente+=addition.cents%100;
                    neweuro+=cents/100;
        }

        Money newMoney = new Money(neweuro,newcente);

        return newMoney;
    }
    public boolean lessThan(Money compared){

        Money newMoney = new Money(this.euros,this.cents);
if(compared.euros>this.euros)
{
    return  true;
}
else if (compared.euros==this.euros)
{
    if (compared.cents>this.cents)
    {
        return true;
    }
}

return false;

    }
    public Money minus(Money decreaser){

        int neweuro= this.euros-decreaser.euros;
        int newcente= this.cents-decreaser.cents;

        if(decreaser.cents>=100)
        {
            newcente-=decreaser.cents%100;
            neweuro-=cents/100;
        }

        Money newMoney = new Money(neweuro,newcente);

        return newMoney;
    }

    @Override
    public String toString() {
        return "Money{" +
                "euros=" + euros +
                ", cents=" + cents +
                '}';
    }
}
