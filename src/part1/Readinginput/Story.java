package part1.Readinginput;
import java.util.Scanner;
public class Story {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.\n" +"What is the main character called?");
        String bob=in.nextLine();
        System.out.println("What is their job?");
        String builder=in.nextLine();
        System.out.println("Here is the story:\n" +
                "Once upon a time there was "+bob+", who was "+builder+".\n" +
                "On the way to work, "+bob+"reflected on life.\n" +
                "Perhaps "+bob+ "will not be "+builder+" forever.");


    }
}
