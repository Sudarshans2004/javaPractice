package methodoverriding;

// return type should be same for primitive but non primitive classes can
// have covarient return type like object and String

public class MathodOverridingRule4 {
    public Object display (){
        return null;
    }
}
class chhild extends MathodOverridingRule4{
    public String display (){
        return null;
    }
}
class mmain{
    public static void main(String[] args) {

    }
}
