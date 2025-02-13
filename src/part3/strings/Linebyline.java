package part3.strings;

import java.util.Scanner;

public class Linebyline {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter statement:");
     String statement=in.nextLine();
    String[] pieces=statement.split(" ");
        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i]);
        }
    }
}
