package array;

import java.util.*;

public class MinSubarrayLength {
    private static int minSubArrayLen(int target, int[] nums) {
        int minN=1;
        int val =0;
        SortedSet<Integer> li = new TreeSet<>();

        for(int i =0;i<nums.length;i++){
            int sum =0;
            int count=0;

            for(int j=i;j<nums.length;j++){
                sum +=nums[j];
                count++;
                if(sum==target){
                    li.add(count);
                }
            }
        }
        val =li.first();
        System.out.println(val);
        return 0;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,1,2,4,3};
        minSubArrayLen(7,arr);
    }
}
