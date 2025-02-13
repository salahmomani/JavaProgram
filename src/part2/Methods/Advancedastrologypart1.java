package part2.Methods;

import java.util.Scanner;

public class Advancedastrologypart1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

              printSpaces(5);
        System.out.println("///");
        printStars(3);
    }
    public static void  printSpaces(int number)
    {
        for (int i=0;i<number;i++)
        {
            System.out.print(" ");

        }
    }
    public static void printStars(int number) {
        for (int i=0;i<number;i++)
        {
            System.out.print("*");

        }
        System.out.print("\n");
    }
}
