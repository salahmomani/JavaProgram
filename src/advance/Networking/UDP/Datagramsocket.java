package advance.Networking.UDP;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Datagramsocket {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket=new DatagramSocket();
        String name="salah almomani";
        InetAddress ip=InetAddress.getByName("127.0.0.1");
        DatagramPacket datagramPacket=new DatagramPacket(name.getBytes(StandardCharsets.UTF_8),name.length(),ip,2000);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
