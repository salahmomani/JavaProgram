package part1.Conditionalstatementsandconditionaloperation;

import java.util.Scanner;

public class Adulthood {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How old are you?");
        int old=in.nextInt();
        if(old<18){
            System.out.println("You are not an adult");
        }
        else {
            System.out.println("You are an adult" );
        }
    }
}
