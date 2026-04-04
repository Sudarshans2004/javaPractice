package multithreading;

public class ExtendingThreadClass extends Thread {
    public void run(){
        System.out.println("run");
    }

    public static void main(String[] args) {
        ExtendingThreadClass e = new ExtendingThreadClass();
        Thread t = new Thread(e);
        t.start();
    }
}
