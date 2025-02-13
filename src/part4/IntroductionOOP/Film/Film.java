package part4.IntroductionOOP.Film;

public class Film {
    String name;
    int ageRating;
    public Film(String filmName, int filmAgeRating){

        name=filmName;
        ageRating=filmAgeRating;
    }
    public String name(){
        return  name;
    }
    public int ageRating(){
        return ageRating;
    }
}
