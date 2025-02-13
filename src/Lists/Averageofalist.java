package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Averageofalist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

int count=0;
double avg=0;
        ArrayList<Integer> list = new ArrayList<>();
        int sum=0;
        int number;
        while (true)
        {
            number=in.nextInt();
            if(number==-1){break;}
            list.add(number);
            count++;
      }
        for(int i = 0; i < list.size(); i++) {
             sum += list.get(i);

            }
        avg=1.0*sum/count;
        System.out.println(avg);
    }
}
