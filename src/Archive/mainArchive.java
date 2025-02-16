package Archive;

import Books.Books;

import java.util.ArrayList;
import java.util.Scanner;

public class mainArchive {
    public static void main(String[] args) {
        ArrayList<Archive> arch = new ArrayList<>();

        while (true) {
            Scanner in=new Scanner(System.in);

            System.out.println("Identifier? (empty will stop):");
            String Identifier=in.nextLine();
            if(Identifier.isEmpty()){break;}

            System.out.println("Name (empty will stop)");
            String name=in.nextLine();
            if(name.isEmpty()){break;}

            Archive aar=new Archive(name,Identifier);

            if(!(arch.contains(aar)))
            {
                arch.add(aar);
            }


        }
//        for (int i=0;i<arch.size();i++)
//        {
//            System.out.println(arch.get(i));
//        }
        for (Archive a:arch)
        {
            System.out.println(a);
        }
    }
}
