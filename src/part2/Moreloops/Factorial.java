package part2.Moreloops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int fact=1;
        System.out.print("Give a number:");
        int num=in.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.println("the Factorial is "+fact);

    }
}
