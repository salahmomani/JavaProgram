package part1.Conditionalstatementsandconditionaloperation;

import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Give number:");
        int PNnum=in.nextInt();
        if(PNnum<0){
            System.out.println("The number is not positive");
        }
        else if(PNnum>0) {
            System.out.println("The number is positive");
        }
else{
            System.out.println("Number is 0");
        }



    }
}
