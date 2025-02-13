package part2.Methods;

import java.util.Scanner;

public class printchristmasTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printchristmasTree(10);
    }


    public static void  printchristmasTree(int height)
    {
        int cons=1;
        for (int i=1;i<=height;i++)
        {
            for(int j=height-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<cons;k++)
            {
                System.out.print("*");

            }
            System.out.print("\n");
            cons+=2;
        }

    }
}
