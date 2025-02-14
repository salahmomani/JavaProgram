package part4.fileandreadingdata;

import java.util.Scanner;

public class NumberofStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
int count=0;
String test;

        while (true) {
            String line = in.nextLine();

            if (line.equals("end")) {
                break;
            }
            count++;

        }



        System.out.println(count);

        }
    }

