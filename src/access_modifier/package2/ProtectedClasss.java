package access_modifier.package2;
import access_modifier.package1.ProtectedClass;

public class ProtectedClasss extends ProtectedClass {
    public static void main(String[] args) {
        ProtectedClasss obj = new ProtectedClasss();
        System.out.println(obj.x);
        obj.show();
    }
}
