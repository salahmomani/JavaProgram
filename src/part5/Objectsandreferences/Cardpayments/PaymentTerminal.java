package part5.Objectsandreferences.Cardpayments;
public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        money=1000;
        affordableMeals=0;
        heartyMeals=0;
    }

    public double eatAffordably(double payment) {
        double price = 2.50;
        if (payment >= price) {
            this.money += price;
            this.affordableMeals++;
            return payment - price; // Return change
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        double price = 4.30;
        if (payment >= price) {
            this.money += price;
            this.heartyMeals++;
            return payment - price; // Return change
        }
        return payment;
    }
    public boolean eatAffordably(PaymentCard card) {
        double price = 2.50;
        if (card.takeMoney(price)) {
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double price = 4.30;
        if (card.takeMoney(price)) {
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }
        public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}