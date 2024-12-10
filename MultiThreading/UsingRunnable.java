package MultiThreading;

public class UsingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        UsingRunnable runnable = new UsingRunnable();
        Thread t= new Thread(runnable);
        t.start();
    }
}
