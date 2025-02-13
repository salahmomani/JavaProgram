package part1.Conditionalstatementsandconditionaloperation;

import java.util.Scanner;

public class Ancient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give number:");
        int year = in.nextInt();
        if (year < 2015) {
            System.out.println("Ancient history!");


        }
    }
}