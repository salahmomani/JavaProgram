package part2.Moreloops;

import java.util.Scanner;

public class Countingtohundred {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count=in.nextInt();

        for (int i=count;i<=100;i++)
        {
            System.out.println(i);

        }
    }
}
