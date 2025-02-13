package part2.Methods;

import java.util.Scanner;

public class Fromoneparameter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printUntilNumber(5);
    }
    public  static void printUntilNumber(int num){
        for (int i=1;i<=num;i++) {
            System.out.println(i);
        }
    }
}
