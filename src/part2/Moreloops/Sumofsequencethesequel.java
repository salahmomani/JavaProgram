package part2.Moreloops;

import java.util.Scanner;

public class Sumofsequencethesequel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int sum=0;
        System.out.println("First number? ");
        int num1=in.nextInt();
        System.out.println("last number? ");
        int num2=in.nextInt();

        for (int i=num1;i<=num2;i++)
        {
            sum+=i;

        }
        System.out.println("the sum is "+sum);

    }
}

