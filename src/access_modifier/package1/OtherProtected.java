package access_modifier.package1;

public class OtherProtected {
    public static void main(String[] args) {
        ProtectedClass obj = new ProtectedClass();
        obj.show();
        System.out.println(obj.x);
    }
}
