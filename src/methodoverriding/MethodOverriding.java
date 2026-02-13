package methodoverriding;

public class MethodOverriding{
     void show(){
         System.out.println("overidden ethod");
    }
}
class child1 extends MethodOverriding{
    void show(){
        System.out.println("Overriding Method");
    }
}
class a{
    public static void main(String[] args) {
        MethodOverriding  m = new MethodOverriding();
        m.show();
        child1 c = new child1();
        c.show();
//        Based on runtime object jvm will execute child obj in overiding
        MethodOverriding m1 = new child1();
        m1.show();
    }
}
