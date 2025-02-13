package part1.Readinginput;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("What's your name?");
        String test4=in.nextLine();
        System.out.println("Hi"+test4);
    }
}
