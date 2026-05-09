package java8;

public class ToUpperCase {
    public static void main(String[] args) {

        UpperCase u = String::toUpperCase;
        String s = u.toConvertUpperCase("SUdarshAn");
        System.out.println(s);
    }
}
