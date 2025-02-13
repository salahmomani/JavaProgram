package part1.Conditionalstatementsandconditionaloperation;

import java.util.Scanner;

public class Checkingtheage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.print("How old are you?");
        int age=in.nextInt();
        if(age>=0 && age<=120){
            System.out.println("Ok");
        }
        else{
            System.out.println("impossible");
        }
    }
}
