package part9.Interfaces.interfaceinabox;

public class Book implements  Packables{
String author;
String nameOfTheBook;
double weightOfTheBook;

    public Book(String author, String nameOfTheBook, double weightOfTheBook) {
        this.author = author;
        this.nameOfTheBook = nameOfTheBook;
        this.weightOfTheBook = weightOfTheBook;
    }

    @Override
    public double weight() {
return  weightOfTheBook;    }

    @Override
    public String toString() {
         return author + ": " + nameOfTheBook;
    }
}
