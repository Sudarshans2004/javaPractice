package basicjavacodes;

public class Palindrome {
    public static void main(String[] args) {
        String s = "nayan";
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s)){
            System.out.println("ispalindrome");
        }else {
            System.out.println("not plaindrome");
        }
    }
}
