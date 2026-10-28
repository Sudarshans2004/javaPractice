package array;

public class MaxElementInWindow {
    public static void main(String[] args) {
        int arr [] = {10,15,13,18,25,12,7,3,5,1,4,-6,2};
        int k =4;
        for(int j = 0;j<arr.length-k;j++){
            int i=j;
            int max = 0;
            while(i<j+k){
                if(arr[i]>max){
                    max= arr[i];
                }

                i++;
            }
            System.out.println(max);
        }

    }
}
