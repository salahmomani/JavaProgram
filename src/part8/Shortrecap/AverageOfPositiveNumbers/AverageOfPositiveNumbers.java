package part8.Shortrecap.AverageOfPositiveNumbers;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number=0;
        int counter=0;
        int sum=0;
        while (true)
        {
            number=in.nextInt();
            if (number==0){break;}

            if(number >=0  || number <= 100)
            {
                sum+=number;
                counter++;
            }

        }
        System.out.println(1.0*sum/counter);
    }
}
