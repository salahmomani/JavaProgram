package advance.Networking.one;
import java.io.BufferedReader;
import java.io.*;

import java.net.*;

public class Networking {

   public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Local IP Address: " + address.getHostAddress());

            InetAddress w3schools = InetAddress.getByName("www.w3schools.com");
            System.out.println("w3schools IP: " + w3schools.getHostAddress());
            System.out.println("w3schools Host: " + w3schools.getHostName());

        } catch (Exception e) {
            e.printStackTrace();
        }
//
//        try (ServerSocket server = new ServerSocket(5000)) {
//            System.out.println("Server is listening on port 5000...");
//            Socket socket = server.accept();
//
//            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
//
//            String message = input.readLine();
//            System.out.println("Client says: " + message);
//            output.println("Hello, Client!");
//
//            socket.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//       try (Socket socket = new Socket("localhost", 5000)) {
//           BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//           PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
//
//           output.println("Hello, Server!");
//           String response = input.readLine();
//           System.out.println("Server says: " + response);
//       } catch (IOException e) {
//           e.printStackTrace();
//       }
    }
}
