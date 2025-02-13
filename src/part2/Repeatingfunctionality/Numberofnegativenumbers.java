package part2.Repeatingfunctionality;

import java.util.Scanner;

public class Numberofnegativenumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int count=0;

        while (true){
    System.out.println("Give a number:");
    int num= in.nextInt();
    if (num==0)
    {break;}
    else if (num<0) {
        count++;
    }

}
        System.out.println("Number of numbers: "+count);
    }
}
