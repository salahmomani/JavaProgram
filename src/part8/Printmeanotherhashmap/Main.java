package part8.Printmeanotherhashmap;


import java.util.HashMap;

import static part8.Printmeanotherhashmap.Program.printValueIfNameContains;
import static part8.Printmeanotherhashmap.Program.printValues;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }
}