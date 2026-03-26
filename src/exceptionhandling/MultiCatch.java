package exceptionhandling;

import static exceptionhandling.Throw.e;

public class MultiCatch {
    public static void main(String[] args) {
        try{
//            System.out.println(10/0);
            String s = null;
            s.concat("anc");
            System.out.println(s);

        }catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e  ){
            System.out.println(e.getMessage());;
        }
    }
}
