package part3.strings;

import java.util.Scanner;

public class Printthrice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Give a word");
        String thrice=in.nextLine();
        System.out.println(thrice+thrice+thrice);

    }
}
