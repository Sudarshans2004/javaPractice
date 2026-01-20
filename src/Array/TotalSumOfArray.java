package Array;

//Write a Java program to sum values of an array.


public class TotalSumOfArray {
    public static void x (int arr[]){
        int result=0;
        for(int i=0;i<arr.length;i++){
             result += arr[i];
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5,6,7,8,9};
         x(x);
    }
}
