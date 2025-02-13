package part3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Sumofalist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int sum=0;
        int number;
        while (true)
        {
            number=in.nextInt();
            if(number==-1){break;}
            list.add(number);
      }
        for(int i = 0; i < list.size(); i++) {
             sum += list.get(i);

            }
        System.out.println(sum);
    }
}
