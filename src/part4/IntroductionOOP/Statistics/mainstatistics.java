package part4.IntroductionOOP.Statistics;

import java.util.Scanner;

public class mainstatistics {
    public static void main(String[] args) {

        Scanner in=new  Scanner(System.in);
        int num;
        statistics statistics = new statistics();
        statistics oddstatistics=new statistics();
        statistics evenstatistics=new statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
        while (true) {
            num=in.nextInt();
            if (num==-1)

            {break;}
            statistics.addNumber(num);

        }
            System.out.println("Count: " + statistics.getCount());
            System.out.println("Sum: " + statistics.sum());
            System.out.println("Average: " + statistics.average());
        System.out.println("oddSum: " + statistics.oddsum());
        System.out.println("evenSum: " + statistics.evensum());


    }
}