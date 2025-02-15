package part4.fileandreadingdata;

import java.io.FileWriter;

import java.io.File;
import java.io.IOException;

public class CreatingaNewFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("file.txt");
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write("Hello, world!");
            myWriter.close();
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


