package array;

import java.util.ArrayList;
import java.util.List;

public class TotalSubArrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        List<List<Integer>> li = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            List<Integer> l = new ArrayList<>();
            for(int j =i;j<arr.length;j++){
                l.add(arr[j]);
                li.add(new ArrayList<>(l));
            }
        }
        System.out.println(li);



        //returns count of subarrays
          int n = arr.length;
                // O(1) Time and Space formula
                int totalSubarrays = (n * (n + 1)) / 2;
                System.out.println("Total Subarrays: " + totalSubarrays);

    }
}
