package innerclass.regularinner;

public class InnerClassFromInstance {

    class Inner{
       public void mm2(){
           System.out.println("inner class from instance");
       }

    }
    public void mm1(){
        Inner i = new Inner();
        i.mm2();
    }
    public static void main(String[] args) {
        InnerClassFromInstance i = new InnerClassFromInstance();
        i.mm1();
    }
}
