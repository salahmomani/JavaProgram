package part2.Methods;

import java.util.Scanner;

public class printTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printTriangle(4);
    }
    public static void printTriangle(int size)
    {
        for (int i=1;i<=size;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.print("\n");

        }

    }
}
