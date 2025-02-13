package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Thirdelement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       String element;
       ArrayList<String> list=new ArrayList<>();
        while (true)
        {
            element=in.nextLine();
            if(element.equals("")){break;}
            list.add(element);
        }

        System.out.println( list.get(2));
    }
}
