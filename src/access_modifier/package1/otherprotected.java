package access_modifier.package1;

public class otherprotected {
    public static void main(String[] args) {
        protectedclass obj = new protectedclass();
        obj.show();
        System.out.println(obj.x);
    }
}
