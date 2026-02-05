package nonaccessmodifier;

public class Final {
//    final int x; we have to declare final variable
final int x;
//instance block
    {
        x=10;
    }
    final public void m(){
//we cannot create abstract method in final method; or final class
//   public abstract void m1();

    }
}
