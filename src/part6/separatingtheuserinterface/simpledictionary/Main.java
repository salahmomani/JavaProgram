package part6.separatingtheuserinterface.simpledictionary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /// //////////part////////////
//        SimpleDictionary book = new SimpleDictionary();
//        book.add("one", "yksi");
//        book.add("two", "kaksi");
//
//        System.out.println(book.translate("one"));
//        System.out.println(book.translate("two"));
//        System.out.println(book.translate("three"));

/// ////////////part2/////////////
//        Scanner scanner = new Scanner(System.in);
//        SimpleDictionary dictionary = new SimpleDictionary();
//
//        TextUI ui = new TextUI(scanner, dictionary);
//        ui.start();
////////////part2+3/////////////
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
        System.out.println(dictionary.translate("pike"));
    }
}
