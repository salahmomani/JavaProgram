package Handlingcollectionsasstreams.uniquelastnames;

import java.util.ArrayList;
import java.util.Scanner;


public class UniqueLastNames {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<String> lastNames = new ArrayList<>();
        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String command = in.nextLine();
            if (command.equals("quit")) {
                break;
            }
            System.out.print("Input first name: ");
            String firstName = in.nextLine();

            System.out.print("Input last name: ");
            String lastName = in.nextLine();

            System.out.print("Input the year of birth: ");
            String birthYear = in.nextLine();

            lastNames.add(lastName);
        }
        System.out.println("\nUnique last names in alphabetical order:");
        for (String lastName : lastNames) {
            System.out.println(lastName);
        }
    }
}