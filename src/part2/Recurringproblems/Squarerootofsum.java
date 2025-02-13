package part2.Recurringproblems;

import java.util.Scanner;

public class Squarerootofsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println(Math.sqrt(sum));

    }
}
