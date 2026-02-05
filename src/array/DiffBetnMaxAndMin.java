package array;
//Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1.
public class DiffBetnMaxAndMin {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
        int small=arr[0];
        int large=arr[0];
        int diff =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            } else if (arr[i]<small) {
                small=arr[i];
            }
            diff = large-small;
        }
        System.out.println(diff);

    }
}
