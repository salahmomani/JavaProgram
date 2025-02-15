package part4.fileandreadingdata;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintingaSpecifiedFile {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String file;
        try {
            System.out.println("Which file should have its contents printed?");
            file=in.nextLine();
            File myObj = new File(file);
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
