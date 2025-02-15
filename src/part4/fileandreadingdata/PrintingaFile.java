package part4.fileandreadingdata;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PrintingaFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
