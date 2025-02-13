package part3.strings;

import java.util.Scanner;

public class Isittrue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Give a string:");
        String istrue=in.nextLine();
        if(istrue.equals("true"))
        {
            System.out.println("You got it right!");
        }
        else{
            System.out.println("Try again!");
        }

    }
}
