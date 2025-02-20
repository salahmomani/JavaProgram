package Handlingcollectionsasstreams.readingfilesperline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {

    public static List<String> read(String file) {
            try {
                return Files.readAllLines(Path.of(file));
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
                return List.of();
        }
    }
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
        String filename=in.nextLine();
        List<String> lines = read(filename);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}