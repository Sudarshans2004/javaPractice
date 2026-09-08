package array;

import java.util.Arrays;

public class SortingArrayBasedOnParity {
    public int[] sortArrayByParity(int[] nums) {
        int finalarr []= new int[nums.length];
        if(nums.length==0) {return new int [] {};}
        int j=0;
        for(int i=0 ;i< nums.length;i++){
            if(nums[i]%2==0){
                finalarr[j++]=nums[i];
            }
        }
        for(int i=0 ;i< nums.length;i++){
            if(nums[i]%2!=0){
                finalarr[j++]=nums[i];
            }
        }

        System.out.println(Arrays.toString(finalarr));
        return finalarr;
    }

    public static void main(String[] args) {
        SortingArrayBasedOnParity s= new SortingArrayBasedOnParity();
        int nums []={3,1,2,4};
        s.sortArrayByParity(nums);
    }
}
