package basicjavacodes;

public class CountOfEvenNumberInArray {
    public static void main(String[] args) {
        int [] nums = {123,5,4,78,7894};
//        int x = 21213;
        int n = nums.length;
        int count = 0;
        for (int i =0 ; i<n; i++){
            int x= nums[i];
            String s=String.valueOf(x);
            if(s.length()%2==0){
                count++;
            }
        }
        System.out.println(count);


//        System.out.println((int) (Math.log10(x))+1);
    }
}
