package array;

import java.util.HashSet;

public class ThirdHighestNumber {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
       for(int i =0; i<nums.length;i++){
           hash.add(nums[i]);
       }
        System.out.println(hash);
       return 0;
    }
}
class demo{
    public static void main(String[] args) {
        ThirdHighestNumber t = new ThirdHighestNumber();
        int a []={2,2,3,1};
        t.thirdMax(a);
    }
}
