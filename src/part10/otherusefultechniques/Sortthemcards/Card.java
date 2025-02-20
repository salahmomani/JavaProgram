package part10.otherusefultechniques.Sortthemcards;

public class Card implements Comparable<Card> {
    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card other) {
        if (this.value == other.value) {
            return this.suit.ordinal() - other.suit.ordinal();
        }
        return this.value - other.value;
    }

    @Override
    public String toString() {
        String faceValue;
        switch (this.value) {
            case 11: faceValue = "J"; break;
            case 12: faceValue = "Q"; break;
            case 13: faceValue = "K"; break;
            case 14: faceValue = "A"; break;
            default: faceValue = String.valueOf(value);
        }
        return suit + " " + faceValue;
    }
}
