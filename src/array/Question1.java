package array;
//How to separate zeros from non-zeros in an array?
//
//Write a Java program to separate zeros from non-zeros in the given array.
// You have to move zeros either to end of the array or bring them to beginning of the array.
// For example, if {14, 0, 5, 2, 0, 3, 0} is the given array, then moving zeros to end of the array will result
// {14, 5, 2, 3, 0, 0, 0}
// and bringing zeros to front will result {0, 0, 0, 14, 5, 2, 3}.
public class Question1 {
    public static void main(String[] args) {
        int count=0;
        int []arr = {14,0,5,2,0,3,0};
        int newArr[] = new int [arr.length];
        for(int i=0,j=0;i<=arr.length-1;i++){
            if(arr[i] !=0){
                newArr[j]=arr[i];
                j++;
            }

        }
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}
