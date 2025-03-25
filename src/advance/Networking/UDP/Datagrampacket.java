package advance.Networking.UDP;

import java.io.*;
import java.net.*;

public class Datagrampacket {

    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket(2000);

        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, 1024);
        datagramSocket.receive(datagramPacket);
        String str = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
        System.out.println(str);
        datagramSocket.close();
    }
}
