package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("First");
        wordList.add("Second");

        System.out.println(wordList.get(3));
    }
}
