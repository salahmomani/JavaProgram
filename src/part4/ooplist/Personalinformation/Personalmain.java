package part4.ooplist.Personalinformation;

import part4.ooplist.Items.Items;

import java.util.ArrayList;
import java.util.Scanner;

public class Personalmain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
String fn,ln;
int ID;
        ArrayList<PersonalInformationCollection> list = new ArrayList<>();
        while (true)
        {
            System.out.println("if you want exit loop enter No in first name");

            System.out.print("First name");
          fn=in.next();
          if (fn.equals("no"))
          {break;}

            System.out.print("last name");
          ln=in.nextLine();
            System.out.print("Identification numbe");
          ID=in.nextInt();

          list.add(new PersonalInformationCollection(fn,ln,ID));

        }
        for (
        PersonalInformationCollection p:list)
        {
            System.out.println(p.toString());
        }
    }
}
