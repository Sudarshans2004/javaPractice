package interviewbasiccode;

import java.util.ArrayList;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Sudarshan";
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());

        ArrayList<Character> ar = new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--){
            char j = s.charAt(i);
            ar.add(j);
        }
        System.out.println(ar);
    }
}
