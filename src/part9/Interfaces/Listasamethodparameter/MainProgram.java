package part9.Interfaces.Listasamethodparameter;

import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));
    }
    public static int returnSize(ArrayList<String> nameList){
        return  nameList.size();
    }
}
