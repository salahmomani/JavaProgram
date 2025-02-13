package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Onlythesenumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         int where,from;
            int count=0;
        ArrayList<Integer> numberlist = new ArrayList<>();
        int number;
        while (true)
        {
            number=in.nextInt();
            if(number==-1){break;}
            numberlist.add(number);
          count++;

        }
        System.out.print("From where?");
        where=in.nextInt();
        System.out.println("To where?");
        from=in.nextInt();
        for (int i=where;i<=from;i++)
        {
            System.out.println(numberlist.get(i));
        }


    }
}
