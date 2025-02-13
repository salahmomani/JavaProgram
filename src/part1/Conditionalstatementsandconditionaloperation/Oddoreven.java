package part1.Conditionalstatementsandconditionaloperation;

import java.util.Scanner;

public class Oddoreven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.println("Give the number:");
        int OEnum=in.nextInt();
        if(OEnum%2==0) {
            System.out.println("Number " + OEnum + " is even");
        }
        else {
            System.out.println("Number " + OEnum + " is odd");
        }
    }
}
