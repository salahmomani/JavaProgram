package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Onthelist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ArrayList<String> namelist = new ArrayList<>();
        String name,search;
        boolean list=false;
        while (true)
        {
            name=in.nextLine();
            if(name.equals("")){break;}
            namelist.add(name);
        }
        System.out.print("Search for?");
        search=in.nextLine();
        for(int i=0;i<namelist.size();i++)
        {

            if(search.equals(namelist.get(i)))
            {
                System.out.println(search+" was found");
                list=true;
                break;
            }

        }
        if(list==false) {
            System.out.println(search+" was not found");
        }

    }
}
