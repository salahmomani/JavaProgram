package part3.Arrays;

import java.util.Scanner;

public class Indexwasnotfound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Search for?");
int num=in.nextInt();
boolean check=false;
int[] arr=new int[5];
int num1,num2;
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 9;
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                System.out.println(num+" is at index "+i);
                check=true;
                break;
            }
        }
        if(check==false)
        {
            System.out.println(num+" was not found.");
        }



    }
}
