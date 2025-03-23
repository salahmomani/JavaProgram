package advance;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyThread2 {
    public static class myrRun implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                    System.out.println(e);                }
//                System.out.println("implements Runnable start");
//                System.out.println("implements Runnable finish");
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException, IOException {
//      //  myrRun mr=new myrRun();
//        Thread thread=new Thread(new MyThread2.myrRun());
//        Thread thread2 =new Thread(new MyThread2.myrRun());
//        thread.start();
//        try {
//            thread.join();
//        } catch (Exception e)
//        {
//            System.out.println(e);
//        }
//            thread2.start();
        Socket socket = new Socket("jenkov.com", 80);
        OutputStream out = socket.getOutputStream();

        out.write("some data".getBytes());
        out.flush();
        out.close();

        socket.close();

        Socket socket1 = new Socket("jenkov.com", 80);
        InputStream in = socket1.getInputStream();

        int data = in.read();
//... read more data...

        in.close();
        socket1.close();
    }
}