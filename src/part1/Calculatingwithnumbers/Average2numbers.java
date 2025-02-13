package part1.Calculatingwithnumbers;

import java.util.Scanner;

public class Average2numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first =in.nextInt();
        System.out.println("Give the second number:");
        int second =in.nextInt();
        int avg=(first+second)/2;
        System.out.println("The average is " +avg);


    }
}
