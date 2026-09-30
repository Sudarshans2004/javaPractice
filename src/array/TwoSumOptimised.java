package array;

import java.util.Arrays;

public class TwoSumOptimised {

    private static int[] twoSum(int[] nums, int target) {

        Arrays.sort(nums);

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            int val = target - nums[i];

            if (binarySearch(nums, val)) {

                result[0] = nums[i];
                result[1] = val;

                return result;
            }
        }

        return result;
    }

    private static boolean binarySearch(int[] arr, int val) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == val) {
                return true;

            } else if (val < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);

        System.out.println(Arrays.toString(result));
    }
}