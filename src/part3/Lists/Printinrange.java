package part3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Printinrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> numtest=new ArrayList<>();

        numtest.add(3);
        numtest.add(2);
        numtest.add(6);
        numtest.add(-1);
        numtest.add(5);
        numtest.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numtest, 3, 10);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit)
    {
        ArrayList<Integer> num=new ArrayList<>();
        for (int i=0;i<numbers.size();i++)
        {
            if(numbers.get(i)>=lowerLimit && numbers.get(i)<=upperLimit)
            {
                num.add(numbers.get(i));
            }
        }
        System.out.println(num);
    }
}
