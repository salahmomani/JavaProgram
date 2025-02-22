package part12.Randomness.Numbers;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {


    Scanner in=new Scanner(System.in);
    Random random = new Random();

    System.out.print("How many random numbers should be generated? ");
    int count = in.nextInt();

        for (int i = 0; i < count; i++) {
        int randomNumber = random.nextInt(11);
        System.out.println(randomNumber);
    }

}
}
