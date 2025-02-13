package part2.Methods;

import java.util.Scanner;

public class Fromparametertoone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printFromNumberToOne(5);
    }
    public  static void printFromNumberToOne(int num){
        for (int i=num;i>=1;i--) {
            System.out.println(i);
        }
    }
}
