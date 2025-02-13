package part3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Rememberthesenumbers {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int count = 0;
        ArrayList<Integer> numberlist = new ArrayList<>();
        int number;
        while (true) {
            number = in.nextInt();
            if (number == -1) {
                break;
            }
            numberlist.add(number);
            count++;

        }
        for (int i = 0; i < count; i++) {
            System.out.println(numberlist.get(i));
        }

    }

}