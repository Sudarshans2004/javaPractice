package access_modifier.package2;

import access_modifier.package1.PublicClass;

public class PublicClasss {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        System.out.println(obj.x);
        obj.print();
    }
}
