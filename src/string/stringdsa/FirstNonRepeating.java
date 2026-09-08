package string.stringdsa;

import java.util.LinkedHashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "sudarshan";

//        for(char ch:str.toCharArray()){
//            if(str.indexOf(ch)==str.lastIndexOf(ch)){
//                System.out.println(ch);
//                break;
//            }
//        }
//        LinkedHashMap<Character,Integer>map =new LinkedHashMap<>();
//        for(char ch :str.toCharArray()){
//            map.put(ch, map.getOrDefault(ch,0)+1);
//
//        }
//        for(char key: map.keySet()) {
//            if(map.get(key)==1){
//                System.out.println(key);
//                break;
//            }
//        }

        System.out.println((char)str
                .chars()
//                .mapToObj(c->(char)c)
                .filter(ch-> str.indexOf((char)ch)==str.lastIndexOf((char)ch))
                .findFirst()
                .orElse(-1));

    }
}
