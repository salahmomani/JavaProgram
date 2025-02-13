package part1.Variables;
import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Give a number:");
        int num1= in.nextInt();
        System.out.println("You gave the number "+num1);

    }
}
