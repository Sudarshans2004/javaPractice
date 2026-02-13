package methodoverriding;
// if parent ethod is vararg and child method is non vararg then it is method overloading not overriding
public class MethodOverridingUsingVararg {
    public void m3(int... x){
        System.out.println("Vararg");
    }
}
class g extends MethodOverridingUsingVararg{
    public void m3(int x){
        System.out.println("Child");
    }
}
class t{
    public static void main(String[] args) {
        MethodOverridingUsingVararg  m = new MethodOverridingUsingVararg();
        m.m3(10);
        g g= new g();
        g.m3();
//        Based on refence object jvm will execute child obj in method hiding
       MethodOverridingUsingVararg m1 = new g();
        m1.m3();
    }
}

//in above code if both parent class and child class are vararg method then this will be method overriding