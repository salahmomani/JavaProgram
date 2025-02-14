package part4.fileandreadingdata;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number;
        int result;
        while (true)
        {
            number=in.next();
            if(number.equals("end")){
                break;
            }
             result = Integer.parseInt(number);
            System.out.println(result*result*result);
        }

    }
}
