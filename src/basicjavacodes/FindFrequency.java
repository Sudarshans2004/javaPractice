package basicjavacodes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindFrequency {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,2,1,4,5,1,7,5,5,5};
        int result = -1;
        HashMap <Integer,Integer> h = new HashMap<>();
        for(int i = 0; i< arr.length;i++){
                h.put(arr[i], h.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
           int key = -1;
           int value = 0;
           key = entry.getKey();
           value = entry.getValue();
           if(key == value){
                result = Math.max(key ,result);
           }
        }
        System.out.println(result);
        Iterator i = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }
}
