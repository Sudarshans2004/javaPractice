package string;

public class pract {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = s3.intern();
        System.out.println(s1 == s2);

    }

}
