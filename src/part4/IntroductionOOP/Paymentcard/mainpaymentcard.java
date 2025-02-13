package part4.IntroductionOOP.Paymentcard;

public class mainpaymentcard {
    public static void main(String[] args) {
        Paymentcard card = new Paymentcard(10);
        /// ////////////part1+2+3///////////////////
//        System.out.println(card);
//        card.eatHeartily();
//
//        //card.eatAffordably();
//        System.out.println(card);
//
//        card.eatHeartily();
//       // card.eatAffordably();
//        System.out.println(card);
/// //////////part4+part5//////////
//        System.out.println(card);
//
//        card.addMoney(15);
//        System.out.println(card);
//
//        card.addMoney(10);
//        System.out.println(card);
//
//        card.addMoney(-200);
//        System.out.println(card);
        /// /////////////part6/////////////// all above in here
        Paymentcard paulsCard = new Paymentcard(20);
        Paymentcard mattsCard = new Paymentcard(30);
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("paul "+paulsCard.toString());
        System.out.println("matt "+mattsCard.toString());
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("paul "+paulsCard.toString());
        System.out.println("matt "+mattsCard.toString());
paulsCard.eatAffordably();
paulsCard.eatAffordably();
mattsCard.addMoney(50);
        System.out.println("paul "+paulsCard.toString());
        System.out.println("matt "+mattsCard.toString());
    }
}
