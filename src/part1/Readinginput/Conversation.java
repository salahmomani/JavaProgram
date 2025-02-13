package part1.Readinginput;
import java.util.Scanner;
public class Conversation {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.println("Greetings! How are you doing?");
        String test5 = in.nextLine();
        System.out.println(test5);
        System.out.println("Oh, how interesting. Tell me more!");
        String test6 = in.nextLine();
        System.out.println(test6);
        System.out.println("Thanks for sharing!\n");

    }
}