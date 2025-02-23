package part6.separatingtheuserinterface.simpledictionary;

import java.util.Scanner;

public class TextUI {
    Scanner in;
    SimpleDictionary dictionary;
    public TextUI(Scanner in,SimpleDictionary dictionary) {
        this.in=in;
        this.dictionary=dictionary;
    }

    public void start(){
        while (true){
        System.out.print("Command: ");
        String command=in.nextLine();

        if(command.equals("end"))
        {
            System.out.println("Bye bye!");
            break;
        }
        else if(command.equals("add")) {
            System.out.println("Word: ");
            String word=in.nextLine();
            System.out.println("Translation: ");
            String translation=in.nextLine();
            this.dictionary.add(word,translation);

        }
        else if(command.equals("search")) {
            System.out.println("To be translated:  ");
            String word=in.nextLine();
            String translation=dictionary.translate(word);
            if(translation==null) {
                System.out.println("Translation: null");
            }
            else {
                System.out.println("Translation: "+translation);
            }
        }
        else {
            System.out.println("Unknown command");
        }
    }
}
}
