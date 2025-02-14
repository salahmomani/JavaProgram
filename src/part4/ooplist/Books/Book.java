package part4.ooplist.Books;

public class Book {
    String Title;
int page;
    int Publicationyear ;


    public Book(String Title,int page,int Publicationyear){
        this.page=page;
        this.Title=Title;
        this.Publicationyear=Publicationyear;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPublicationyear(int publicationyear) {
        Publicationyear = publicationyear;
    }

    public String getTitle() {
        return Title;
    }

    public int getPage() {
        return page;
    }

    public int getPublicationyear() {
        return Publicationyear;
    }

    public  void printname(){
        System.out.println(Title);
    }
    public  void printyear(){
        System.out.println(Publicationyear);
    }
    public  void printpage(){
        System.out.println(page);
    }
}
