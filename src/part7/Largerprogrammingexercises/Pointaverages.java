package part7.Largerprogrammingexercises;

import java.util.Scanner;

public class Pointaverages {
    public static void main(String[] args) {


        int sum = 0, count = 0;

        while (true) {
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();

            if (number == -1) {
                break;
            }
            if (number >= 0 && number <= 100) {
                sum += number;
                count++;
            }
        }
        System.out.println("Point average (all): "+(sum/(count*1.0)));
    }
}