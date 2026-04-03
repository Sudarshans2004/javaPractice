package multithreading;

public class CombinationOfBothMeth extends  Thread{
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        CombinationOfBothMeth r = new CombinationOfBothMeth();
        Thread t = new Thread(r);
        r.start();
        for(int i =0;i<10;i++){
            System.out.println("Parent Thread");
        }
    }
}
