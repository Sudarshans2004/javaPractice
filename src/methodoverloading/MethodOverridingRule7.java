package methodoverloading;

//While overriding we cant reduce scope of access modifier but we can increase scope
// if public -> public
//protected -> public protected
//default -> public protected default
public class MethodOverridingRule7 {
    public void m1(){
        System.out.println("Public Meth");
    }
}
class chilld extends MethodOverridingRule7{
//    WE cannot reduce scope for public child should be public
//    void m1(){
//
//    }
}
