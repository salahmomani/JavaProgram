package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Lastinlist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        ArrayList<String> namelist = new ArrayList<>();
        String name;
        while (true)
        {
            name=in.nextLine();
            if(name.equals("")){break;}
            namelist.add(name);
            count++;

        }
        System.out.println(namelist.get(count-1));

    }

}
