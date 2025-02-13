package part3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Removelast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.print(strings);

    }
    public static void removeLast(ArrayList<String> strings)
    {
        for (int i=0;i<strings.size();i++)
        {
            if(i==strings.size()-1)
            {
                strings.remove(strings.size()-1);
            }
        }
    }
}
