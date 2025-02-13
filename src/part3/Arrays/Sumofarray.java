package part3.Arrays;

import java.util.Scanner;

public class Sumofarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println( sumOfNumbersInArray(numbers));
    }
    public static int sumOfNumbersInArray(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        return sum;
    }

}
