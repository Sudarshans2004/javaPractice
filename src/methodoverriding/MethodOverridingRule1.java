package methodoverriding;
//    1)) both parent and child should have parent child relationship

public class MethodOverridingRule1 {

    void method() {
        System.out.println("parent -");
    }

}
      class c extends MethodOverridingRule1{
          void method(){
              System.out.println("child reletionship");
          }
      }
class b{
    public static void main(String[] args) {
        MethodOverridingRule1 m =new MethodOverridingRule1();
        m.method();
        c c = new c();
        c.method();

    }
}
