package part10.otherusefultechniques.Sortthemcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(cards);
    }
    public int compareTo(Hand other) {
        int thisSum = this.cards.stream().mapToInt(Card::getValue).sum();
        int otherSum = other.cards.stream().mapToInt(Card::getValue).sum();
        return Integer.compare(thisSum, otherSum);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}

