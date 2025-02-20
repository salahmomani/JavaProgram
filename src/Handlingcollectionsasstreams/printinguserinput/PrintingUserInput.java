package Handlingcollectionsasstreams.printinguserinput;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {
    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<>();
        String word;
        Scanner in=new Scanner(System.in);
while (true)
{
    word=in.nextLine();
    if(word.isEmpty())
    {
        break;
    }
    inputs.add(word);
}
        System.out.println(inputs);
    }
}