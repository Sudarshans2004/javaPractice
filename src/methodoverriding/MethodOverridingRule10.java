package methodoverriding;
//If both parent and child class have static method then it is not method overriding it is method hiding
public class MethodOverridingRule10 {
    public static void m2(){
        System.out.println("Parent method");
    }
}
class m extends MethodOverridingRule10{
    // we cannot override static methods and we cant override non-static method to static method
//
//    public void m2(){
//
//    }
    public static void m2(){
        System.out.println("Child Method");
    }
}
class ma{
    public static void main(String[] args) {
        MethodOverridingRule10  m = new MethodOverridingRule10();
        m.m2();
        m c = new m();
        c.m2();
//        Based on refence object jvm will execute child obj in method hiding
        MethodOverridingRule10 m1 = new m();
        m1.m2();
    }
}
