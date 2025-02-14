package part4.ooplist.Books;

import part4.ooplist.Personalinformation.PersonalInformationCollection;
import part4.ooplist.Television.TelevisionProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class mainBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String title;
        int Page;
        int year;

        String test;

        ArrayList<Book> list = new ArrayList<>();
        while (true) {
            System.out.println("if you want exit loop enter No");
            System.out.print("Title");
            title = in.next();
            if (title.equals("no")) {
                break;
            }

            System.out.print("page");
            Page = in.nextInt();
            System.out.print("year");
            year = in.nextInt();

            list.add(new Book(title, Page, year));

        }
        System.out.println("enter What information will be printed? ");
        test=in.next();
        if (test .equals( "Name") ){
            for (Book b : list) {
                b.printname();

            }

        } else if (test.equals(  "year")) {
            for (Book b : list) {
                b.printyear();
            }

        } else if (test.equals ("page")) {
            for (Book b : list) {
                b.printpage();

            }
        }
    }
}