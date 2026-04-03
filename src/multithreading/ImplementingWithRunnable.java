package multithreading;

public class ImplementingWithRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
        }
    }
}
class threadDemo {
        public static void main(String[] args) {
            ImplementingWithRunnable r = new ImplementingWithRunnable();
            Thread t = new Thread(r);
            t.start();
            for (int i = 0; i < 10; i++) {
                System.out.println("Main thread");
            }
    }
}