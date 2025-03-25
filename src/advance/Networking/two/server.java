package advance.Networking.two;
import java.io.*;
import java.net.*;

public class server {

    public static void main(String[] args) throws IOException {


        ServerSocket serverSocket = new ServerSocket(5000);
        Socket socket = serverSocket.accept();
        DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String str1="",str2="";
        while (!str1.equals("stop")){
            str1=dataInputStream.readUTF();
            System.out.println("client :"+str1);
            str2=bufferedReader.readLine();
            dataOutputStream.writeUTF(str2);
            dataOutputStream.flush();

        }
        socket.close();
        serverSocket.close();
        dataInputStream.close();
        }
    }
