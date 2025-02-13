package part4.IntroductionOOP.Paymentcard;

public class mainpaymentcard {
    public static void main(String[] args) {
        Paymentcard card = new Paymentcard(5);
        System.out.println(card);
        card.eatHeartily();

        //card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
       // card.eatAffordably();
        System.out.println(card);
    }
}
