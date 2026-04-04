package multithreading;

public class MyThread extends  Thread {
    public void start(){
        super.start();
        System.out.println("start meth");
    }
    public void run(){
        System.out.println("run");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println("main");
    }
}
