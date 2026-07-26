package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestSubsequence {
        public int findLengthOfLCIS(int[] nums) {
            int count=1;
            List<Integer> l1 = new ArrayList<>();
            for(int i =0;i<nums.length-1;i++){
                if(nums[i]<nums[i+1]){
                    count++;
                }else{
                    l1.add(count);
                    count=1;
                }
            }
            Collections.sort(l1);
            return l1.get(l1.size()-1);
        }
}
class main {
    public static void main(String[] args) {
        LongestSubsequence l = new LongestSubsequence();
        int arr [] = {1,3,5,4,2,3,4,5};
        System.out.println(l.findLengthOfLCIS(arr));;
    }
}
