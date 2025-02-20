package part10.otherusefultechniques.Sortthemcards;

public class Main {
    public static void main(String[] args) {
        Hand hand = new Hand();
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        System.out.println("Original Hand:");
        hand.print();

        System.out.println("\nSorted Hand:");
        hand.sort();
        hand.print();

        Hand hand1 = new Hand();
        hand1.add(new Card(2, Suit.DIAMOND));
        hand1.add(new Card(14, Suit.SPADE));
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(2, Suit.SPADE));

        Hand hand2 = new Hand();
        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));

        System.out.println("\nComparing Hands:");
        if (hand1.compareTo(hand2) < 0) {
            System.out.println("Better hand is:");
            hand2.print();
        } else if (hand1.compareTo(hand2) > 0) {
            System.out.println("Better hand is:");
            hand1.print();
        } else {
            System.out.println("Hands are equal.");
        }

        System.out.println("\nSorting Hand by Suit:");
        hand.sortBySuit();
        hand.print();
    }
}
