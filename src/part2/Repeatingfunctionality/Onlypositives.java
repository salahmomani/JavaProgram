package part2.Repeatingfunctionality;

import java.util.Scanner;

public class Onlypositives {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true)
{
    System.out.println("Give a number:");
    int num= in.nextInt();
    if(num==0)
    {break;}
    else if (num<0) {
        System.out.println("Unsuitable number");
    }
    else {
        System.out.println(Math.pow(num,2));
    }

}
    }
}
