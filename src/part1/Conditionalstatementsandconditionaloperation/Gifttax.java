package part1.Conditionalstatementsandconditionaloperation;

import java.util.Scanner;

public class Gifttax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Value of the gift?");
        double tax = 0;
        int gift=in.nextInt();
        if(gift<5000){
            System.out.println("No tax!");
        }
        else if(gift>=5000 && gift<25000)
        {
            tax=((gift-5000)*0.08)+100;
        }
        else if(gift>=25000 && gift<55000){

            tax=((gift-25000)*0.1)+1700;
        }

        else if(gift>=55000 && gift<200000){

            tax=((gift-55000)*0.12)+4700;
        }

        else if(gift>=200000 && gift<1000000){

            tax=((gift-200000)*0.15)+22100;
        }
        else{    tax=((gift-1000000)*0.17)+142100;
        }
        System.out.println("Tax: "+tax);



    }
}
