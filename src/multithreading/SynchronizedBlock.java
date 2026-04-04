package multithreading;

class Display {
    public void wish(String name ){
        ;;;;;;;;;
        synchronized (this){
            for(int i =0;i<10;i++){
                System.out.println("Good morning :" + name);
            }
            try{
                Thread.sleep(10000);
            }catch (InterruptedException e){

            }
        }
    }
}
class MyThreaad extends Thread{
    Display d ;
    String name ;
    MyThreaad(Display d , String name){
        this.d=d;
        this.name=name;
    }
    public void run (){
        d.wish(name);
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        Display d = new Display();
        MyThreaad t1 = new MyThreaad(d,"Dhoni");
        MyThreaad t2 = new MyThreaad(d,"Sharma");
        t1.start();
        t2.start();
    }
}
