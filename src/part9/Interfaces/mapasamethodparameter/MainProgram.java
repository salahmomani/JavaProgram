package part9.Interfaces.mapasamethodparameter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainProgram {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));

    }

    public static int returnSize(HashMap<String,String> nameList){
        return  nameList.size();
    }
}