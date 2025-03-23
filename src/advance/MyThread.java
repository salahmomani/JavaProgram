package advance;

public class MyThread extends Thread {
    public  void run(){
        System.out.println("start");
        System.out.println("finish");
    }

    public static void main(String[] args) {
        MyThread mT=new MyThread();
        mT.start();
        mT.start();
    }
}
