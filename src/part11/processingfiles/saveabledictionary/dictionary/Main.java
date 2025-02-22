package part11.processingfiles.saveabledictionary.dictionary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        SaveableDictionary dictionary = new SaveableDictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("apina", "apfe");
//
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("monkey"));
//        System.out.println(dictionary.translate("ohjelmointi"));
//        System.out.println(dictionary.translate("banana"));

//
//        SaveableDictionary dictionary = new SaveableDictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("ohjelmointi", "programming");
//        dictionary.delete("apina");
//        dictionary.delete("banana");
//
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("monkey"));
//        System.out.println(dictionary.translate("banana"));
//        System.out.println(dictionary.translate("banaani"));
//        System.out.println(dictionary.translate("ohjelmointi"));

        Scanner fileReader = new Scanner(System.in);
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] parts = line.split(":");

            System.out.println(parts[0]);
            System.out.println(parts[1]);
        }
    }
}
