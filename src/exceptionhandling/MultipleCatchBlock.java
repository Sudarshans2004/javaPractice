package exceptionhandling;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
//        if the child already catched the exception then the parent catch will not execute
        catch (Exception e) {
            System.out.println("Exception");
        }

//        }catch (ArithmeticException e){
//            we have to take care of child parent relationship in multiple catch block we have to take child first
//        }
    }
}
