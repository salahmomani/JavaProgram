package part4.fileandreadingdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Isitinthefile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for file name
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        // Ask for the search string
        System.out.println("Search for:");
        String searchString = scanner.nextLine();

        boolean found = false;

        // Try reading the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchString)) {
                    found = true;
                    break;
                }
            }

            // Print result
            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (IOException e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

    }
}
