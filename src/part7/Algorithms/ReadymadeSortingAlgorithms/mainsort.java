package part7.Algorithms.ReadymadeSortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.sort;
import static part7.Algorithms.ReadymadeSortingAlgorithms.main.sortIntegers;
import static part7.Algorithms.ReadymadeSortingAlgorithms.main.sortStrings;

public class mainsort {
    public static void main(String[] args) {
        int[] intArray = {5, 2, 8, 3, 1};
        sort(intArray);
        System.out.println("Sorted int array: " + Arrays.toString(intArray));

        String[] stringArray = {"banana", "apple", "cherry", "date"};
        sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(5, 2, 8, 3, 1));
        sortIntegers(intList);
        System.out.println("Sorted integer list: " + intList);

        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("banana", "apple", "cherry", "date"));
        sortStrings(stringList);
        System.out.println("Sorted string list: " + stringList);
    }
}
