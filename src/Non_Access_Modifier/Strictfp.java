package Non_Access_Modifier;

// strictfp can be used with abstract class
public abstract strictfp class Strictfp {

    // strictfp IS not allowed at method level with abstract class
//    public abstract strictfp void m1();

    public static void main(String[] args) {
        double a = 10.0 / 3;
        System.out.println(a);
    }
}
