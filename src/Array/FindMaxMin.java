package Array;

public class FindMaxMin {
    public static void minMax(int nums[]){
        int largest =nums[0];
        int smallest=nums[0];
        for(int i=1;i< nums.length;i++){

                if(nums[i]>largest){
                    largest=nums[i];

                }
                if(nums[i]<smallest){
                    smallest=nums[i];
                }

        }
        System.out.println(smallest+" "+largest);
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9};
        minMax(nums);
    }
}
