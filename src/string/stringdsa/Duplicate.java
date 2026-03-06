package string.stringdsa;

import java.util.HashSet;

public class Duplicate {

    public static void main(String[] args) {
        String s = "sudarshan";
        String s1 = "";
        HashSet h = new HashSet();
        for(char ch :s.toCharArray()){
            h.add(ch);
        }
        System.out.println(h);



    }
}
