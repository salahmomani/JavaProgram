package Handlingcollectionsasstreams.AverageofNumbers;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
String number;
int intnumber;
int sum=0;
int counter=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Input numbers, type \"end\" to stop.\n");
    while (true)
        {
            number=in.nextLine();
            if(number.equals("end"))
            {
                break;
            }
            intnumber= Integer.valueOf(number);
            counter++;
            sum+=intnumber;
        }
        System.out.println(1.0*sum/counter);
    }
}