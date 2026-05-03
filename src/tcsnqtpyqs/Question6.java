package tcsnqtpyqs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//🔷 Question 13 — Bridge Construction (Median of Merged Positions)
//Two roads A and B have strong ground positions. Combine both sets, remove duplicates, sort them, then find the median of the combined positions.
//
//Examples:
//
//N1=3, N2=3, A=3 5 2, B=1 2 3 → Combined sorted unique: 1 2 3 5 → Output: 2.50
//N1=2, N2=3, A=2 3, B=5 6 4 → Combined sorted unique: 2 3 4 5 6 → Output: 4.00
//Input: N1, N2, then N1 values (one per line), then N2 values (one per line) Output: Median (2 decimal places)
public class Question6 {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            HashSet<Integer> al = new HashSet<>();
            for(int num : nums1){
                al.add(num);
            }
            for(int num : nums2){
                al.add(num);
            }
            ArrayList<Integer> list = new ArrayList<>(al);
            Collections.sort(list);
            System.out.println(list);
            Integer[] arr = list.toArray(new Integer[0]);
            double median =0.0;
             int n = arr.length;
             int m = arr[n/2];
             int o = arr[(n/2)-1];
            if(list.size()%2==0){
                median =(double)(m+o)/2;
            }else {
                median = arr[n/2];
            }
            System.out.println(median);
            System.out.println(arr.toString());

            return 0;

        }

    public static void main(String[] args) {
          Question6 q = new Question6();
        q.findMedianSortedArrays(
                new int[]{2,2,4,4},
                new int[]{2,2,2,4,4}
        );    }
}
