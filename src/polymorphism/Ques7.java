package polymorphism;

public class Ques7 {
//    8) Method Overriding shows static polymorphism. True or false?
//      false It does not show method overriding it shows method hiding
    static void m1(){
        System.out.println("");
    }
    class child extends Ques7 {
        static void m1() {

        }
    }
}
