import java.io.*;

public class Serialization implements Serializable {

    public static void main(String[] args) throws IOException {
User user=new User();
user.name="salah";
user.password="123";
FileOutputStream fileOutputStream=new FileOutputStream("data2.txt");
ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
 objectOutputStream.writeObject(user);
 objectOutputStream.close();
 fileOutputStream.close();
        System.out.println("object saved");
    }
}
