package Array;
//Write a Java program to find duplicate values in an array of integer values.

public class DuplicateIntArray {
    public static void main(String[] args) {
        int []arr={1,2,1,4,5,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
