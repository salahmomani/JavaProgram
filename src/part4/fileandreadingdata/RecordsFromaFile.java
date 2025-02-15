package part4.fileandreadingdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RecordsFromaFile {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // Ask for file name
        System.out.println("Name of the file:");
        String fileName = in.nextLine();

        // Try reading the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                int commaIndex = line.indexOf(",");
                if (commaIndex != -1) {
                    String name = line.substring(0, commaIndex);
                    String ageStr = line.substring(commaIndex + 1).trim();
                    int age = Integer.valueOf(ageStr);

                    String yearText = (age == 1) ? "year" : "years";

                    System.out.println(name + ", age: " + age + " " + yearText);
                }
            }
        } catch (IOException e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

        in.close();
    }
}
