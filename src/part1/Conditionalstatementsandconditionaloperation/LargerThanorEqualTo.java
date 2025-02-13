package part1.Conditionalstatementsandconditionaloperation;

import java.util.Scanner;

public class LargerThanorEqualTo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.println("Give the first number:");
        int first =in.nextInt();
        System.out.println("Give the second number:");
        int second =in.nextInt();

        if(first>second){
            System.out.println("Greater number is: "+first);
        }
        else if(second>first){
            System.out.println("Greater number is: "+second);
        }
        else{
            System.out.println("The numbers are equal!" );
        }

    }
}
