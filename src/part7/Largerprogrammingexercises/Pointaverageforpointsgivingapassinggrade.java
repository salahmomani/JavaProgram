package part7.Largerprogrammingexercises;

import java.util.Scanner;

public class Pointaverageforpointsgivingapassinggrade {
    public static void  main(String[] args){

        int sum=0,counter=0;
        int sumval=0,count=0;
        Scanner in= new Scanner(System.in);
        System.out.println("enter bassing number");
        int test=in.nextInt();
        System.out.println("Enter point -1 stops:");

        while (true){
            int number  = in.nextInt();

            if(number==-1){
                break;
            }
            if (number>=0 && number<=100){
                sum+=number;
                counter++;
            }

            if (number>=test && number<=100){
                sumval+=number;
                count++;
            }
        }

        System.out.println("Point average : "+(sum/(counter*1.0)));
        System.out.println("Point average by passing: "+(sumval/(count*1.0)));
    }
}
