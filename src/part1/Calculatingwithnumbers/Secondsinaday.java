package part1.Calculatingwithnumbers;

import java.util.Scanner;

public class Secondsinaday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.println("How many days would you like to convert to seconds?");
        int second =in.nextInt();
        System.out.println(second*24*60*60);
    }
}
