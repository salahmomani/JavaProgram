package part2.Repeatingfunctionality;

import java.util.Scanner;

public class NumberofNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

int count=0;

while (true){
    System.out.println("Give a number:");
    int num= in.nextInt();
    if (num==0)
    {break;}
    else {count++;}

}
        System.out.println("Number of numbers: "+count);


    }
}
