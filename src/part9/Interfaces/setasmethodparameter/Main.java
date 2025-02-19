package part9.Interfaces.setasmethodparameter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));
    }


    public static int returnSize(HashSet<String> nameList){
        return  nameList.size();

    }
}