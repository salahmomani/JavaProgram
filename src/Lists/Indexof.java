package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Indexof {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ArrayList<Integer> list = new ArrayList<>();
        int number;
        while (true)
        {
            number=in.nextInt();
            if(number==-1){break;}
            list.add(number);
      }
        System.out.print("Search for? ");
        int search=in.nextInt();
        for(int i = 0; i < list.size(); i++) {
if(search==list.get(i))
{
    System.out.println(search+" is at index "+i);
}

        }


    }
}
