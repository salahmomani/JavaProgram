package part4.fileandreadingdata;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromaFile {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String file,name;
        ArrayList<String> lines = new ArrayList<>();
        System.out.println("name of file");
        file=in.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            File myObj = new File(file);
            Scanner myReader = new Scanner(myObj);
            while (scanner.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("enter name");
                name=in.nextLine();
            if(data.equals(name))
            {
                System.out.println("The name is on the list.");
            }
            else {
                System.out.println("The name is not on the list.");
            }

            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
