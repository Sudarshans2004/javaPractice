package methodoverriding;

// if parent method is finl then child method cannot override that method
public class MethodOverridingRule6 {
    public final int m1 (){
        return 10+20;
    }

}
class chhhild extends MethodOverridingRule6{
//    public void m1(){ we cannot override final Method

//    }
}
