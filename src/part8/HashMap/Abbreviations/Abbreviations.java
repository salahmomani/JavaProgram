package part8.HashMap.Abbreviations;

import java.util.HashMap;

public class Abbreviations {

    String text = "";
           HashMap <String ,String> list=new HashMap<>();
//      ArrayList <String> explanation=new ArrayList<>();
//      ArrayList <String> abbreviation=new ArrayList<>();

    public void addAbbreviation(String abbreviation, String explanation) {
          list.put(abbreviation,explanation);

    }

    public boolean hasAbbreviation(String abbreviation) {
            if(this.list.containsKey(abbreviation));
            {
                return true;
            }

    }

    public String findExplanationFor(String abbreviation){

            if(this.list.containsKey(abbreviation))
            {
                return  this.list.get(abbreviation);
            }


        return null;
    }
}