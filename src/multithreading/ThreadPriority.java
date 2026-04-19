package multithreading;

public class ThreadPriority {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println("child thread");
                }
            }
        };

        System.out.println("Default Main Priority: " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(2);
        System.out.println("Updated Main Priority: " + Thread.currentThread().getPriority());

        Thread t = new Thread(r);

        t.setPriority(Thread.MAX_PRIORITY);

        t.start();

        for (int i = 0; i < 2; i++) {
            System.out.println("main thread");
        }
    }
}