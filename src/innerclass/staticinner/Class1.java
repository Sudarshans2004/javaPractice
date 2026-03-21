package innerclass.staticinner;

public class Class1 {
    static  class Nested{
        void m8(){
            System.out.println("Static Nested");
        }
    }

    public static void main(String[] args) {
     Nested n = new Nested(); //here no need to create object of outer class
     n.m8();
    }
}
