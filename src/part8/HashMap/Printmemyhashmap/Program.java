package part8.HashMap.Printmemyhashmap;

import java.util.HashMap;

public class Program {
    HashMap<String,String>listHash=new HashMap<>();

    public static void printKeys(HashMap<String,String> hashmap)
    {
        for (String s:hashmap.keySet())
        {
            System.out.println(s);
        }
    }
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){

        for (String s:hashmap.keySet())
        {
            if(s.contains(text)){
            System.out.println(s);
        }
        }
    }
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for (String s:hashmap.keySet())
        {
            if(s.contains(text)){
                System.out.println(hashmap.get(s));
            }
        }
    }
}
