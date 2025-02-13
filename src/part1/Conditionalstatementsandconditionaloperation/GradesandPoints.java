package part1.Conditionalstatementsandconditionaloperation;

import java.util.Scanner;

public class GradesandPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give points [0-100]:");

        int grade= in.nextInt();
        if(grade<0){
            System.out.println("Grade:impossible!");
        }
        else  if(grade>=0 && grade<=49){
            System.out.println("Grade:Failed");
        }
        else if(grade>=50 && grade<=59)
        {
            System.out.println("Grade:1");
        }
        else if(grade>=60 && grade<=69)
        {
            System.out.println("Grade:2");
        }
        else if(grade>=70 && grade<=79)
        {
            System.out.println("Grade:3");
        }
        else if(grade>=80 && grade<=89)
        {
            System.out.println("Grade:4");
        }
        else if(grade>=90 && grade<=100)
        {
            System.out.println("Grade:5");
        }
        else {
            System.out.println("incredible!");
        }

    }
}
