package part4.fileandreadingdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NumbersFromaFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask for file name
        System.out.print("File? ");
        String fileName = in.nextLine();

        // Ask for lower and upper bounds
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(in.nextLine());

        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(in.nextLine());

        int count = 0;

        // Try reading the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.valueOf(line);

                // Check if number is within range
                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }

            // Print result
            System.out.println("Numbers: " + count);
        } catch (IOException e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

        in.close();
    }
}
