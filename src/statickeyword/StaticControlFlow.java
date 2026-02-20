package statickeyword;

// 1) Identification of static members from top to bottom or parent to child
// 2) Execution of static variable assignments & static blocks from parent to child
// 3) Execution of only child main methds

public class StaticControlFlow {
    static int x=10;
    static {
        m1();
        System.out.println("Child static Block");

    }

    public static void main(String[] args) {
        m1();
        System.out.println("Parent main");
        System.out.println(x);
    }
    public static void m1(){
        System.out.println(y);
    }
    static int y =20;
}
class derived extends StaticControlFlow{
    static int i = 10;
    static {
        m2();
        System.out.println("Parent 1st Static Block");

    }

    public static void main(String[] args) {
        m2();
        System.out.println("child main");
    }
    public static void m2(){
        System.out.println(j);
    }
    static {
        System.out.println("static 2nd block");
    }
    static int j = 20;
}
