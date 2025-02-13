package part2.Moreloops;

import java.util.Scanner;

public class Sumofasequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int sum=0;
        System.out.print("Last number?");
        int num=in.nextInt();
        for(int i=1;i<=num;i++)
        {
            sum+=i;
        }
        System.out.println("the sum is "+sum);

    }
}
