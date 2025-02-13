package part2.Repeatingfunctionality;

import java.util.Scanner;

public class Carryon {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

while (true)
{
    System.out.println("Shall we carry on?");
    String carry= in.nextLine();
    if(carry.equals("No"))
    {break;}

}

    }
}
