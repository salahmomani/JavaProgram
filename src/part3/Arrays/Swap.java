package part3.Arrays;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


int helper;
int[] arr=new int[5];
int num1,num2;
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 9;
        System.out.println("Give two indices to swap:");
    num1=in.nextInt();
    num2=in.nextInt();

    helper=arr[num1];
    arr[num1]=arr[num2];
    arr[num2]=helper;
    for (int i=0;i<arr.length;i++)
    {

        System.out.println(arr[i]);
    }
    }
}
