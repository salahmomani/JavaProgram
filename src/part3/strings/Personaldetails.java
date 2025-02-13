package part3.strings;

import java.util.Scanner;

public class Personaldetails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String name;
        int date=0;
        int sum=0;
        double avg=0;
        int count=0;
        String temp="";
        while (true)
        {
            name=in.nextLine();
            date=in.nextInt();
            if (name.equals(""))
            {
                break;
            }
sum+=date;


            if(temp < name.length())
            {
                temp=name;
            }

        }
        avg=1.0*sum/count;
        System.out.println("Name of the oldest: "+temp);
        System.out.println(avg);
    }
}
