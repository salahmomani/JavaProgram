package advance.Networking.URL;
import java.io.*;
import java.net.*;

public class HttpUrl {
    public static void main(String[] args) throws IOException {
        URL url=new URL( "https://www.w3schools.com");
        HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
        int count=0;
        while (count<10) {
            System.out.println(urlConnection.getHeaderFieldKey(count)+"= "+urlConnection.getHeaderField(count));
            count++;
        }
        urlConnection.disconnect();
    }
}
