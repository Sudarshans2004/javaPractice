package access_modifier.package2;

public class DefaultClass {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
//        obj.print();   //         we cannot access form diffrent class
//        System.out.println(obj.x); //error
    }
}
