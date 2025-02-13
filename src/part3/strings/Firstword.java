package part3.strings;

import java.util.Scanner;

public class Firstword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter statement:");
     String statement=in.nextLine();
    String[] pieces=statement.split(" ");
        System.out.println(pieces[0]);


    }
}
