package multithreading;

public class Join implements Runnable{
    @Override
    public void run() {
        for(int i =0;i<10;i++){
            System.out.println("child");
        }
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Join j = new Join();
        Thread t = new Thread(j);
        t.start();
        t.join();
        for(int i =0;i<10;i++){
            System.out.println("Parent");
        }

    }
}
