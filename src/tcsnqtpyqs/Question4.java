package tcsnqtpyqs;

import java.util.HashMap;
import java.util.Map;

public class Question4 {
    public  String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String , Integer> map  =  new HashMap<>();
        StringBuilder sb = new StringBuilder ();
        String [] str1 = s1.split(" ");
        String  [] str2 = s2.split(" ");
        for(int i = 0; i< str1.length; i++){
            map.put(str1[i],map.getOrDefault(str1[i],0)+1);
        }
        for(int i = 0; i< str2.length; i++){
            map.put(str2[i],map.getOrDefault(str2[i],0)+1);
        }
        int val = -1;
        String key = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
             key = entry.getKey() ;
            val = entry.getValue();
            if(val ==1){
                sb.append(key+" ");
            }
        }
        System.out.println(val);
        System.out.println(key);

        String strr = sb.toString();
        String res [] = strr.split(" ");

        return res;
    }

    public static void main(String[] args) {
        Question4 u = new Question4();
        u.uncommonFromSentences("fd kss fd","fd kss fd");
    }
}
