package multithreading.waitnotifynotifyall;

public class WaitAndNotify {

  public static void main(String[] args) throws  InterruptedException{
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b){
            System.out.println( "main meth calling wait");
            b.wait();
            System.out.println("main thread got notification ");
            System.out.println(b.total);
        }
    }
}

class ThreadB extends Thread{
    int total = 0;
    public void run(){
        synchronized (this){
            System.out.println("child thread starts calculation");
            for(int i =0;i<1000;i++){
                total+=i;
            }
            System.out.println("child thread giving notification");
            this.notify();
        }
    }


}

