package part2.Methods;

import java.util.Scanner;

public class Reprint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many times?\n");
        int repprint=in.nextInt();
        for (int i=0;i<repprint;i++)
        {
            printText();
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");    }


}
