package advance.Networking.one;
import java.io.*;
import java.net.*;
public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server is listening on port 5000");
            Socket socket = server.accept();
            DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String message = dataInputStream.readLine();
            System.out.println("Client says: " + message);
            output.println("Hello, Client!");

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}