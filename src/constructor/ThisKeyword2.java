package constructor;

public class ThisKeyword2 {
    ThisKeyword2(){
        System.out.println("no-arg");
    }
    ThisKeyword2(int x ){
        this();
        System.out.println("int arg");
    }
    ThisKeyword2(double y){
        this(10);
        System.out.println("double arg");
    }

    public static void main(String[] args) {
        ThisKeyword2 s = new ThisKeyword2(10.5);
    }
}
