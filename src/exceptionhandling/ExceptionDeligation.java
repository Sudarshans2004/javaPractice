package exceptionhandling;

public class ExceptionDeligation {
    void m1() throws ArithmeticException{
        System.out.println(10/0);
    }
    void m2() throws ArithmeticException{
        m1();
    }

    public static void main(String[] args) {
        ExceptionDeligation e = new ExceptionDeligation();
        try{
            e.m2();
        }catch (ArithmeticException a){
            System.out.println("Exception deligation");
        }
    }
}
