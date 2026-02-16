package doubleequalsanddotequals;

// in dot equals method if we override the method then only it perform content comparision
//otherwise it will behave like == method means it will compare reference of object or check both refrences
// points towards one address

public class A {
    static class test {

    }
    public static void main(String[] args) {
        String s1 = new String("s");
        String s2 = new String("s");
        System.out.println(s1.equals(s2)); //true becoz we override s1 to s2
        test t1 = new test();
        test t2 = new test();
        System.out.println(t1.equals(t2)); //false here we are not overriding so it behaves like normal == method
    }
}
