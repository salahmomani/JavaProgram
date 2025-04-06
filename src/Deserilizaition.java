import java.io.*;


public class Deserilizaition {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        User user = null;
        FileInputStream fileInputStream = new FileInputStream("/home/trainee2/Downloads/Java Programming/data2.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        user=(User) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println(user.name);
        System.out.println(user.password);

        long serialVersionUID=ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}