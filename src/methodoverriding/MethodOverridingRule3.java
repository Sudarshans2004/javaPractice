package methodoverriding;

// 3)) in overriding return type should be same for primitive type

public class MethodOverridingRule3 {
    int display(int x){
return x;
    }
}
class childd extends MethodOverridingRule3{
    int display(int s){
        return  s+100;
    }
}
class main {
    public static void main(String[] args) {
        MethodOverridingRule3 m = new MethodOverridingRule3();
        m.display(10);
    }
}
