package part5.Objectsandreferences.Song;

public class Song {

    String name;
    String songer;
    int year;
    public  Song(String name,String songer,int year)
    {
        this.name=name;
        this.year=year;
        this.songer=songer;
    }

    public boolean equals(Song s){
        if(this.name.equals(s.name));
        {
            return true;
        }

    }
}
