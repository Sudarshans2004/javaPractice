package basicjavacodes;

public class largestNumInArray {

    public static void main(String[] args) {
        int [] arr = {1,5,6,7,8,99,56,20};
        int largest =Integer.MIN_VALUE;
         int i=0;
         int j =arr.length-1;
       while(i<=j) {
           if(arr[i]>largest){
               largest = arr[i];

           }if(arr[j]>largest){
               largest=arr[j];
           }
           i++;
               j--;

        }
        System.out.println(largest);
    }

}
