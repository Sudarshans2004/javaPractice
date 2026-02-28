package iinterface;

import java.util.SimpleTimeZone;

//    Create interface Calculator:
//Methods:
//add(int a, int b)
//subtract(int a, int b)
//Class:
//SimpleCalculator
//Test in main.
public interface Practice1 {
     interface Calculator{
         void add (int a, int b);
         void Subtract (int a , int b);
     }
     class SimpleCalculator  implements Calculator{

         @Override
         public void add(int a, int b) {
             System.out.println("Addition :"+a+b);
         }

         @Override
         public void Subtract(int a, int b) {
             System.out.println("Subtraction : "+ (a-b));
         }
     }

    public static void main(String[] args) {
        SimpleCalculator s = new SimpleCalculator();
        s.add(10,12);
        s.Subtract(10,12);
        Calculator c = new SimpleCalculator();

    }
}
