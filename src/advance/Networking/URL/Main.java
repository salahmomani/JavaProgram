package advance.Networking.URL;
import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url=new URL( "https://www.w3schools.com");
        System.out.println("protocol "+url.getProtocol());
        System.out.println("host "+url.getHost());
        System.out.println("port "+url.getPort());
URLConnection urlConnection=url.openConnection();
InputStream inputStream=urlConnection.getInputStream();
int count=0;
while ((count=inputStream.read())!=-1)
{
    System.out.print((char)count);
}


    }
}
