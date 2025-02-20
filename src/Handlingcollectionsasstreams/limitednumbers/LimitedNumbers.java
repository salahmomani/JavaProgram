package Handlingcollectionsasstreams.limitednumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static List<Integer> Limited(ArrayList<Integer> numbers)
            {
                return numbers.stream().filter(number -> number <=5 && number>=1).collect(Collectors.toList());

            }
    


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

            int number;
        Scanner in=new Scanner(System.in);
            while (true)
            {
                number=in.nextInt();
                if(number<0)
                {break;}
               numbers.add(number);
            }
        List<Integer> list = Limited(numbers);

        list.stream().forEach(num -> System.out.println(num));

    }
}

