package methodoverloading;

public class MethodOverloading {

    void show(){
        System.out.println("no para ");
    }
    void show(int x){
        System.out.println("int arg");
    }
    void show(int x ,String y){
        System.out.println("int and String arg");
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.show();
        m.show(10);
m.show(10,"Sud");

    }
}
