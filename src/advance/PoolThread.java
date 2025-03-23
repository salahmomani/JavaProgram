package advance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolThread implements  Runnable{
    String name;

    public PoolThread(String name) {
        super();
        this.name = name;
    }



    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"name "+name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"name end ");

    }

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for (int i=0;i<10;i++) {
            Runnable runnable=new PoolThread(""+i);
            executorService.execute(runnable);
        }
executorService.shutdown();
        while (!executorService.isTerminated()) {}
        System.out.println("finished");
    }
}
