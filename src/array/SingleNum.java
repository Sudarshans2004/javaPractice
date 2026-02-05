package array;

import java.util.HashMap;
import java.util.Map;

public class SingleNum {
    public int singleNum(int numm []){
        HashMap<Integer, Integer> map = new HashMap<>();
        int reqNum=0;
              for(int num:numm){
                  map.put(num, map.getOrDefault(num, 0) + 1);
              }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return reqNum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,3,2};
        SingleNum obj = new SingleNum();
        System.out.println(obj.singleNum(arr));
    }
}
