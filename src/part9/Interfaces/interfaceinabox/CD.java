package part9.Interfaces.interfaceinabox;

public class CD implements Packables{
String artist;
 String nameOfTheCD;
    int publicationYear;
    double weightOfAllCDs=0.1;

    public CD(String artist,String nameOfTheCD, int publicationYear) {
        this.artist = artist;
        this.publicationYear = publicationYear;
        this.nameOfTheCD = nameOfTheCD;
    }

    @Override
    public double weight() {
      return   this.weightOfAllCDs;
    }


    @Override
    public String toString() {
        return artist + ": " + nameOfTheCD + " (" + publicationYear + ")";
    }
}
