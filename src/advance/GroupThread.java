package advance;

public class GroupThread implements Runnable {

    @Override
    public void run() {
for (int i=0;i<1000;i++) {
i++;
}
        //System.out.println(Thread.currentThread().getName()+"finished");
        System.out.println(Thread.currentThread().getName()+"[priority"+Thread.currentThread().getPriority()+"]finished");

    }

    public void func(){
        try {

            ThreadGroup parentGroup=new ThreadGroup("parentGroup");
            ThreadGroup childGroup=new ThreadGroup(parentGroup,"childGroup");

            Thread thread1=new Thread(parentGroup,this);
            System.out.println("Start"+thread1.getName());
            thread1.start();

            Thread thread2=new Thread(childGroup,this);
            System.out.println("Start"+thread2.getName());
            thread2.start();

            System.out.println("Thread active"+parentGroup.getName()+"and count "+parentGroup.activeCount());
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.getStackTrace();}
    }


    public void priorityFunc(){
        try {

            ThreadGroup parentGroup=new ThreadGroup("parentGroup");
            parentGroup.setMaxPriority(Thread.MAX_PRIORITY-1);
            ThreadGroup childGroup=new ThreadGroup(parentGroup,"childGroup");
            childGroup.setMaxPriority(Thread.NORM_PRIORITY);

            Thread thread1=new Thread(parentGroup,this);
            thread1.setPriority(Thread.MAX_PRIORITY);
            System.out.println("Start"+thread1.getName());
            thread1.start();

            Thread thread2=new Thread(childGroup,this);
            thread2.setPriority(Thread.MAX_PRIORITY);
            System.out.println("Start"+thread2.getName());
            thread2.start();

            System.out.println("Thread active"+parentGroup.getName()+"//"+parentGroup.activeCount());
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.getStackTrace();}
    }

    public void main(String[] args) {
      GroupThread groupThread=new GroupThread();
        groupThread.func();
        System.out.println("/////////////////////////");
        groupThread.priorityFunc();
    }
}
