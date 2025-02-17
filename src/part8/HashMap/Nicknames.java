package part8.HashMap;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {


        HashMap<String, String> hashList = new HashMap<>();
        hashList.put("matthew's", "matt");
        hashList.put("michael's", "mix");
        hashList.put("arthur's", "artie");


        System.out.println(hashList.get("michael's"));
    }
}