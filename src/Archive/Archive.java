package Archive;

public class Archive {
String Identifier;
 String Name;
 public  Archive(String Name,String Identifier){
     this.Identifier=Identifier;
     this.Name=Name;
 }

    @Override
    public String toString() {
        return "Archive{" +
                "Identifier='" + Identifier + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
