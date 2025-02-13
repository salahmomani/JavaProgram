package part2.Moreloops;

import java.util.Scanner;

public class Fromwheretowherepart2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.println("Where to?");
        int num1=in.nextInt();

        System.out.println("Where from?");
        int num2=in.nextInt();

        for (int i=num2;i<=num1;i++)
        {
            System.out.println(i);

        }
    }
}
