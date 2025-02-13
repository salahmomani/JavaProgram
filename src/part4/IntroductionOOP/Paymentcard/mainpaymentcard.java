package part4.IntroductionOOP.Paymentcard;

public class mainpaymentcard {
    public static void main(String[] args) {
        Paymentcard card = new Paymentcard(10);
//        System.out.println(card);
//        card.eatHeartily();
//
//        //card.eatAffordably();
//        System.out.println(card);
//
//        card.eatHeartily();
//       // card.eatAffordably();
//        System.out.println(card);

        System.out.println(card);

        card.addMoney(15);
        System.out.println(card);

        card.addMoney(10);
        System.out.println(card);

        card.addMoney(-200);
        System.out.println(card);
    }
}
