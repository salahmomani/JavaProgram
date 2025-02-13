package part1.Calculatingwithnumbers;

import java.util.Scanner;

public class Sum2numbers
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.println("Give the first number:");
        int first =in.nextInt();
        System.out.println("Give the second number:");
        int second =in.nextInt();
        int sum=first+second;
        System.out.println("The sum of the numbers is "+sum);
    }
}
