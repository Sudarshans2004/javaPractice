package array;

import java.util.Arrays;

public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        int count =0;
        int n = nums.length;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i =0;i<nums.length;i++){
            if(i%2==0){
                 count = +nums[i];
            }
        }
        return count;
    }
}
class soution{
    public static void main(String[] args) {
        ArrayPairSum a = new ArrayPairSum();
        int w []= {6,2,6,5,1,2};
        a.arrayPairSum(w);
    }
}
