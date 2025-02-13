package part2.Methods;

import java.util.Scanner;

public class printSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        printSquare(4);
    }
    public static void   printSquare(int size)
    {
        for (int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
