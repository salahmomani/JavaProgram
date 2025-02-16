package part7.Largerprogrammingexercises;

import java.util.Scanner;

public class Pointaverageforpointsgivingapassinggrade {
    public static void  main(String[] args){

        int sum=0,counter=0;
        int sumval=0,count=0;
        System.out.println("Enter point -1 stops:");
        while (true){
            Scanner num= new Scanner(System.in);
            int number  = num.nextInt();

            if(number==-1){
                break;
            }
            if (number>=0 && number<=100){
                sum+=number;
                counter++;
            }
            if (number>=50 && number<=100){
                sumval+=number;
                count++;
            }
        }

        System.out.println("Point average : "+(sum/(counter*1.0)));
        System.out.println("Point average by passing: "+(sumval/(count*1.0)));
    }
}
