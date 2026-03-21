package innerclass.regularinner;

//Accessing inner class from static area of outer class

public class InnerClass {

    class Inner {
        public void m1(){
            System.out.println("Inner");
        }
    }

    public static void main(String[] args) {
        InnerClass ic = new InnerClass();
        InnerClass.Inner i = ic.new Inner();
        i.m1();
    }
}
