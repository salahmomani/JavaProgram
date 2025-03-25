package advance.Networking.two;

import jdk.net.Sockets;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String str1="",str2="";
        while (!str1.equals("stop")){
            str1=bufferedReader.readLine();
            dataOutputStream.writeUTF(str1);
            dataOutputStream.flush();
            str2=dataInputStream.readLine();
            System.out.println("server: "+str2);

        }
        socket.close();
        dataInputStream.close();
    }
}
