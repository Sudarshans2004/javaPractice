package methodoverriding;

// Variable resolution is depends on jvm based of refrence types .
// Overriding concept is applcable for methods mot for variable

public class VariableOverriding {

    // if we create variable static or non static the result will be same

    int x = 10;
}
class child extends VariableOverriding{
    int x =100;

}
class d {
    public static void main(String[] args) {
        VariableOverriding v = new VariableOverriding();
        System.out.println(v.x);

        child c = new child();
        System.out.println(c.x);

        VariableOverriding v1 = new VariableOverriding();
        System.out.println(v1.x);
    }
}
