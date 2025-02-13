package part1.Conditionalstatementsandconditionaloperation;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.print("Give a year:");
        int year=in.nextInt();
        if(year%4==0 && year%100==0){
            if (year%400==0)
            {

                System.out.println("The year is a leap year");
            }
            else {
                System.out.println("The year is not a leap year");
            }
        }
        else{
            System.out.println("The year is  not a leap year.");
        }


    }
}
