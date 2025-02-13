package part2.Methods;

import java.util.Scanner;

public class Averaging {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(average(4,3,6,1));
    }
    public static int sum(int number1, int number2, int number3, int number4) {
        int sum=number1+number2+number3+number4;
        return sum;
    }
    public static double average(int number1, int number2, int number3, int number4) {
        int sumre=sum(number1,number2,number3,number4);
        double avg=1.0*sumre/4;
        return avg;
    }

}
