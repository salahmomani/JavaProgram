package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Greatestinlist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ArrayList<Integer> list = new ArrayList<>();
        int Great=0;
        int number;
        while (true)
        {
            number=in.nextInt();
            if(number==-1){break;}
            list.add(number);
      }
        for(int i = 0; i < list.size(); i++) {
             Great = list.get(0);
            int numberloop = list.get(i);
            if (Great <numberloop) {
                Great= numberloop;
            }
        }
        System.out.println(Great);

    }
}
