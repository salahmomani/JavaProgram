package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Indexofsmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        ArrayList<Integer> list = new ArrayList<>();
        int smallest=0;
        int number;
        while (true)
        {
            number=in.nextInt();
            if(number==9999){break;}
            list.add(number);
      }
        for(int i = 0; i < list.size(); i++) {
             smallest = list.get(0);
            int numberloop = list.get(i);
            if (smallest >numberloop) {
                smallest= numberloop;
            }
        }
                System.out.println("Smallest number "+smallest);
                //int search=smallest;
        for(int i = 0; i < list.size(); i++) {
if(smallest==list.get(i))
{
    System.out.println("Found at index:"+i);
}

        }

    }
}
