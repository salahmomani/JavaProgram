package part1.Variables;

import java.util.Scanner;

public class DifferentTypesofInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                System.out.println("Give a string:");
        String bye=in.nextLine();
        System.out.println("Give a integer:");
        int num7=in.nextInt();
        System.out.println("Give a double:");
        double dou2=in.nextDouble();
        System.out.println("Give a boolean:");
        boolean bol2=in.nextBoolean();
        System.out.println("You gave the string " + bye+"\n"+"You gave the integer "+num7+"\n" +
                "You gave the double "+dou2+"\n" +
                "You gave the boolean "+bol2);


    }
}
