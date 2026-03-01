package string.stringdsa;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "";
        String s = "Sudarshan";
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        String s2 ="";
//        System.out.println( sb.reverse());

        for(int i=s.length()-1;i>=0;i--){
                s2 += s.charAt(i);
            }
        System.out.println(s2);
    }
}
