package basicjavacodes;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String st = "swiss";

        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : st.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for( char ch :st.toCharArray() ){
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }

    }
}
