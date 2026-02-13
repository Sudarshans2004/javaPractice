package methodoverriding;
// we can override non abstract class as abstract this
// will help to stop availability of parent method implementation to next levelchild
public class MethodOverridingRule9 {
    public void m1 (){

    }
}
abstract class chiiild extends MethodOverridingRule9{
    public abstract void m1();
}
