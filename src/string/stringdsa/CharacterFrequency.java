package string.stringdsa;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "sudarshan";
        Map<Character,Integer> freq = new LinkedHashMap<>();
        for(char c :s.toCharArray()){
            freq.put(c ,freq.getOrDefault(c,0)+1);
        }
        System.out.println(freq);
    }

}
