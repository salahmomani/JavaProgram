package part2.Methods;

import java.util.Scanner;

public class Starsignpart1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        printStars(5);
        printStars(3);
        printStars(9);
    }
    public static void printStars(int number) {
        for (int i=0;i<number;i++)
        {
            System.out.print("*");

        }
        System.out.print("\n");
    }
}
