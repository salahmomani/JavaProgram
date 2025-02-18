package part8.groupingdatausinghashmaps.Dictionaryofmanytranslations;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String , ArrayList<String>> translations;
    public  DictionaryOfManyTranslations(){
        this.translations=new HashMap<>();
    }
    public void add(String word, String translation){
this.translations.putIfAbsent(word,new ArrayList<>());
        this.translations.get(word).add(translation);

    }
    public ArrayList<String> translate(String word){
        for (String s:this.translations.keySet()){
            if((this.translations.keySet().contains(word)))

            {
return this.translations.get(word);
            }
        }
        return null;
    }

    public void remove(String word){

            this.translations.remove(word);

    }
}
