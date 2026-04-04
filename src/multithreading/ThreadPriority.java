package multithreading;

public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(9);
        System.out.println(Thread.currentThread().getPriority());

    }
}
