package part2.Moreloops;

import java.util.Scanner;

public class Fromwheretowherepart1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Where to?");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);

        }
    }
}