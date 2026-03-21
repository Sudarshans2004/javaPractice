package innerclass.regularinner;

public class InnerClass1 {
    class Inner {
        public void m3 (){
            System.out.println("Inner class ");
        }
    }
}
class Test{
    public static void main(String[] args) {
        InnerClass1 i =new InnerClass1();
        InnerClass1.Inner j = i.new Inner();
        j.m3();
    }
}
