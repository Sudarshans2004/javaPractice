package constructor;

class p {
    p(){
//        invisible superr
        System.out.println("No-Arg constructor p ");
    }
    p(int x ){
        System.out.println("int arg constructor");
    }
    void m1(){
        System.out.println("method");
    }
}
class q extends p{
    q (){
        System.out.println("No-Arg Q");
    }
}


public class ConstructorChanining {
    public static void main(String[] args) {
        q q = new q();
        q.m1();
        p p =new p(10);
    }
}
