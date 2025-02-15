package part5.Book;

public class Book {
    String author;
    String Title;
    int pagecount;
    public Book(String author, String name, int pages){
        this.author=author;
        this.pagecount=pages;
        this.Title=name;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagecount() {
        return pagecount;
    }

    @Override
    public String toString() {
        return
                "author " + author + '\'' +
                ", Title: " + Title +
                ", pagecount=" + pagecount ;
    }
}
