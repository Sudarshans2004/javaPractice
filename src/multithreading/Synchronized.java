package multithreading;

public class Synchronized {
    public synchronized void wish(String name ){
        for( int i =0;i<10;i++){
            System.out.println("Good Morning : " +name);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
            }
        }
    }

}
class MyThreadd extends Thread{
    Synchronized d ;
    String name;
    MyThreadd(Synchronized d , String name){
        this.d=d;
        this.name=name;
    }
    public void run (){
        d.wish(name);
    }

    public static void main(String[] args) {
        Synchronized d = new Synchronized();
        MyThreadd t = new MyThreadd(d,"rohit");
        MyThreadd t1= new MyThreadd(d,"yuvraj");
        t1.start();
        t.start();
    }
}
