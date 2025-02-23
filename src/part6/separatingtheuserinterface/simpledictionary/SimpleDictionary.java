package part6.separatingtheuserinterface.simpledictionary;

import java.util.HashMap;

public class SimpleDictionary {
    private HashMap<String,String> words;

    public SimpleDictionary() {
        this.words = new HashMap<>();
    }
    public void add(String word, String translation ){
        words.put(word,translation);
    }
    public String translate(String word) {
        return words.getOrDefault(word, "null");
    }
}
