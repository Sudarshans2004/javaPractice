package basicjavacodes;

import java.util.Collections;
import java.util.HashSet;

//return largest frequent number

public class FindLucky {
    public static void main(String[] args) {
        int[]arr = {2,2,3,3,4,4,3,5,66,70,70};
         int max = Integer.MIN_VALUE;
         int count = 0;
        HashSet<Integer> h = new HashSet <Integer>();
        HashSet<Integer> h1 = new HashSet <Integer>();
        for(int i =0;i<arr.length;i++){
            if(!h.add(arr[i])){
                h1.add(arr[i]);
            }
        }
        max = Collections.max(h1);
        System.out.println(max);
    }
}
