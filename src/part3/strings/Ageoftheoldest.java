package part3.strings;

import java.util.Scanner;

public class Ageoftheoldest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int age;
        int max=0;
        String temp=" ";
        while (true)
        {
            name=in.next();
            System.out.print(",");
            age=in.nextInt();
            if (name.equals(" "))
            {
                break;
            }

            if(max<age)
            {
                max=age;
                temp=name;
            }

        }
        System.out.println("Name of the oldest: "+temp);

    }
}
