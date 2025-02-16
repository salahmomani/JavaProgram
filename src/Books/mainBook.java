package Books;

import java.util.ArrayList;
import java.util.Scanner;

public class mainBook {
    public static void main(String[] args) {

        int count=0;
        ArrayList<Books> book = new ArrayList<>();
        while (true) {
            System.out.println("Name (no will stop)");
            Scanner in=new Scanner(System.in);
            String name=in.nextLine();
            if(name.isEmpty()){break;}
            System.out.println("Publication year:");
            int year=in.nextInt();
            Books bo=new Books(name,year);
            count++;
            if (book.contains(bo)) {

                System.out.println("The book is already on the list. Let's not add the same book again.");
                count--;
            }

            else {
                System.out.println("this book is not on the list.");
            }
            book.add(bo);

        }

        System.out.println("Thank you! Books added: "+count);

    }
}
