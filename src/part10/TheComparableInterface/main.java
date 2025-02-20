package part10.TheComparableInterface;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("first");
        words.add("second");
        words.add("third");

        String connectedString = "";
        for (int i = 0; i < words.size(); i++) {
            connectedString = connectedString + words.get(i);
        }
        System.out.println(connectedString);
    }
}
