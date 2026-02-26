package string;

import java.util.Locale;

public class StringBasics {
    public static void main(String[] args) {
//        String s1 = new String("sudarshan");
        String s1 = "sudarshan";
        String s2 = s1.toString();
        String s3 = s1.toLowerCase();
        String s4 = s1.toUpperCase();
        System.out.println(s2==s1);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
    }
}
