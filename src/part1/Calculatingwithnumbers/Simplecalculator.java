package part1.Calculatingwithnumbers;

import java.util.Scanner;

public class Simplecalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first =in.nextInt();
        System.out.println("Give the second number:");
        int second =in.nextInt();
        System.out.println(first+" + "+second +" = "+(first+second) );
        System.out.println(first+" - "+second +" = "+(first-second) );
        System.out.println(first+" * "+second +" = "+(first*second) );
        System.out.println(first+" / "+second +" = "+(first/second) );
    }
}
