package multithreading;

//yield method give chance for waiting thread of same priority or if there is no waiting thread or all waiting thread have low priority
//then same thread will execute

public class Yield extends Thread{
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("Child");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(4);
        Yield y = new Yield();
        Thread t = new Thread(y);
        t.start();
        for(int i = 0;i<10;i++){
            System.out.println("Parent");
        }
    }
}
