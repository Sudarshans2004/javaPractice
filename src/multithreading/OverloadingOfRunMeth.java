package multithreading;

public class OverloadingOfRunMeth extends Thread {
     public void run(){
         System.out.println("No-Arg run");
    }
    public void run(int i){
        System.out.println("parametrised run ");
    }

    public static void main(String[] args) {
         OverloadingOfRunMeth o = new OverloadingOfRunMeth();

        Thread t = new Thread(o);
        t.start();
    }
}
