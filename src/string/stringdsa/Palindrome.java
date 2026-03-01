package string.stringdsa;

public class Palindrome {

    public static void main(String[] args) {
        String s = new String("nayan");
        String s1 = "";
        boolean b = false;
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        if(s1.equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
//        StringBuilder sb = new StringBuilder(s);
//        if(s.equals(sb.reverse().toString())){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("not palindrome");
//        }
    }
}
