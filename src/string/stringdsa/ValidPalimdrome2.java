package string.stringdsa;

public class ValidPalimdrome2 {
    public static void main(String[] args) {
        String s = "eceec";
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb1 = new StringBuilder(s);
        if(sb1.toString().equals(sb.reverse().toString())){
            System.out.println("palindrome");
        }

        for(int i =0;i<sb.length();i++){
             if(sb.charAt(i)!=sb1.charAt(i)){
                 sb.deleteCharAt(i);
                 sb1.deleteCharAt(sb.length()-1);

                 if(sb1.toString().equals(sb.toString())){
                     System.out.println(true);
                 }
             }
        }
    }

}
