package part1.Calculatingwithnumbers;

import java.util.Scanner;

public class Average3numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.println("Give the first number:");
        int first =in.nextInt();
        System.out.println("Give the second number:");
        int second =in.nextInt();
        System.out.println("Give the third number:");
        int third =in.nextInt();
        double avg=1.0*(first+second+third)/3;
        System.out.println("The average of the numbers is "+avg);


    }
}
