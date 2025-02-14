package part4.ooplist.Items;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class itemmain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList <Items> itemss=new ArrayList<>();
        LocalTime time = LocalTime.now();

        String s;
        while (true)
        {
            System.out.print("Name:");
            s=in.nextLine();
if(s.isEmpty())
{
    break;
}
itemss.add(new Items(s));
        }

        for (Items i:itemss)
        {
            System.out.println(i.toString()+" "+time);
        }



    }
}
