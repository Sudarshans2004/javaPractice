package exceptionhandling;

public class MethodsToPrintException {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
//            1
            System.out.println(e);
//            2
            System.out.println(e.getMessage());
//            3
            e.printStackTrace();
        }
    }
}
