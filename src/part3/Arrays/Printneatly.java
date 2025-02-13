package part3.Arrays;

import java.util.Scanner;

public class Printneatly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }
    public static void printNeatly(int[] array){

        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+",");
        }
    }

}
