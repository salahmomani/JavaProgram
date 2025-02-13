package part2.Methods;

import java.util.Scanner;

public class printTriangleadvanced {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printTriangleadvanced(4);
    }
    public static void printTriangleadvanced(int size)
    {
        for (int i=1;i<=size;i++)
        {
            for(int j=size;j>=i;j--){
                System.out.print(" ");

            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
