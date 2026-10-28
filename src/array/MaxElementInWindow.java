package array;

public class MaxElementInWindow {
    public static void main(String[] args) {
        int arr [] = {10,15,13,18,25,12,7,3,5,1,4,-6,2};
        for(int j = 0;j<arr.length;j++){
            int i=0;
            int max = 0;
            while(i<=4){
                if(arr[i]>max){
                    max= arr[i];
                }
                System.out.println(max);
                i++;
            }
        }

    }
}
