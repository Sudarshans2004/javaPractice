package exceptionhandling;

public class PracticeQ2 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            throw new ArithmeticException ("chal be");
        }finally {
            throw new ArithmeticException("chal na ");
        }
    }
}
