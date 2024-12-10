package MultiThreading;

public class UsingThread extends Thread{

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        UsingThread demo= new UsingThread();
        Thread t1= new Thread(demo);
        t1.start();
    }

}
