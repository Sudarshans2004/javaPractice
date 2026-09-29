package array;

import java.util.ArrayList;
import java.util.List;

public class SubarraySumEqToK {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        List<List<Integer>> li = new ArrayList<>();
        int count=0;
        int k=3;
        for(int i=0;i<arr.length;i++){
            List<Integer> l = new ArrayList<>();
            int sum =0;
            for(int j =i;j<arr.length;j++){
                sum+=arr[j];

                l.add(arr[j]);
                li.add(new ArrayList<>(l));
                if(sum==k){
                    count++;
                }
            }
        }
        System.out.println(li);
        System.out.println(count);
    }
}
