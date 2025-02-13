package part1.Conditionalstatementsandconditionaloperation;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Password?");
        String pass=in.nextLine();
        if(pass.equals("Caput Draconis"))
        {
            System.out.println("Welcome");

        }
        else {
            System.out.println("Off with you!");
        }
    }
}
