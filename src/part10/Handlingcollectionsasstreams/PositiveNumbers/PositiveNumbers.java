package part10.Handlingcollectionsasstreams.PositiveNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static List<Integer> positive(List<Integer> numbers)
    {
        return numbers.stream().filter(number -> number > 0).collect(Collectors.toList());

    }


    public static List<Integer> positiveArray(List<Integer> numbers)
    {
        return numbers.stream().filter(number -> number > 0).collect(Collectors.toCollection(ArrayList::new));

    }
    public static void main(String[] args) {

        List<Integer> numbers = List.of(-3, -1, 0, 2, 5, -7, 8);
        List<Integer> listnumber = positive(numbers);
        List<Integer> positiveNumbers = positiveArray(numbers);
        System.out.println(listnumber);
        System.out.println(positiveNumbers);
    }
}