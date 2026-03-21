package innerclass.methodlocal;

public class Class1 {
    public void m4(){
        class Inner{
            public void m5(){
                System.out.println("Method local inner class");
            }
        }
        Inner i = new Inner();
        i.m5();
    }

    public static void main(String[] args) {
        Class1 c = new Class1();
        c.m4();
    }

}
