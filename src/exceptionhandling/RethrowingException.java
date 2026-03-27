package exceptionhandling;

public class RethrowingException {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            throw new NullPointerException("NPE");
        }
    }
}
