package exceptionhandling;

public class ExceptionPropogation {
    private static  void m1(){
        System.out.println(10/0);
    }
    private void m2(){
        m1();
    }
    private void m3(){
        m2();
    }

    public static void main(String[] args) {
      ExceptionPropogation e = new ExceptionPropogation();
      e.m3();
    }
}
