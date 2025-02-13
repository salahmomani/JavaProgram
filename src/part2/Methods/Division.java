package part2.Methods;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        division(3,5);
    }
    public static void division(int numerator, int denominator)
    {
        double div=1.0*numerator/denominator;
        System.out.println(div);
    }
}
