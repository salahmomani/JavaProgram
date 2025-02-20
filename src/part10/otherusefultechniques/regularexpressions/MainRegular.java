package part10.otherusefultechniques.regularexpressions;

import java.util.Scanner;

public class MainRegular {
    public static boolean isDayOfWeek(String string)
    {
        String str="mon|tue|wed|thu|fri|sat|sun";

        if(string.matches(str))
     {
    return  true;
     }
return  false;
    }


    public static boolean allVowels(String string)
    {
        String str="[aeiouAEIOU]+";
        if(string.matches(str))
        {
            return  true;
        }
        return  false;
    }

    public static boolean timeOfDay(String string) {
        return string.matches("([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d");
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String day=in.nextLine();

        /// ///////////part1////////////
//        if(isDayOfWeek(day)==true)
//        {
//        System.out.println("The form is correct.");
//    }
//        else {
//            System.out.println("The form is incorrect.");
//        }
        /// /////////////////part2//////////////
//        if(allVowels(day)==true)
//        {
//            System.out.println("The form is correct.");
//        }
//        else {
//            System.out.println("The form is incorrect.");
//        }





                if(timeOfDay(day)==true)
        {
            System.out.println("The form is correct.");
        }
        else {
            System.out.println("The form is incorrect.");
        }

}
}