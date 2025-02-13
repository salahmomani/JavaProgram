package part4.IntroductionOOP.Song;

public class Song {
String name;
int lenght;
    public Song(String name, int length)
    {
        this.name=name;
        this.lenght=length;
    }
    public String name(){
        return name;
    }
    public int length(){
        return  lenght;
    }
}
