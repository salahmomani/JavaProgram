package part10.Handlingcollectionsasstreams.AverageOfSelectedNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        long averageofnegative=0;
        double average=0;
        String np;
        while (true) {
            String row = in.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        np=in.nextLine();
             if(np.equals("n")) {
                 averageofnegative  = (long) inputs.stream()
                         .mapToInt(s -> Integer.valueOf(s))
                         .filter(number -> number < 0)
                         .average()
                         .getAsDouble();
                 System.out.println("Average of the negative numbers:" + averageofnegative);
             }
             else if(np.equals("p")) {
                 average = inputs.stream()
                         .mapToInt(s -> Integer.valueOf(s))
                         .average()
                         .getAsDouble();


                 System.out.println("Average of the positive number: " + average);
             }
}
}