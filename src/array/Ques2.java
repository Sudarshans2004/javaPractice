package array;

//How to find all pairs of elements in an array whose sum is equal to given number?
//
//Write a Java program to find all pairs of elements in the given array whose sum is equal to a given number.
// For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, then you have to find all pairs
// of elements in this array whose sum must be 20. In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose
// sum is 20.
//[4:13 pm, 09/02/2026] Arjun Sir Classes: How to find continuous sub array whose sum is equal to given number?

public class Ques2 {
    public static void main(String[] args) {
        int [] arr = {4,5,7,11,9,13,8,12};
        int target = 20;
        for(int i=0 ; i< arr.length-1;i++) {
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }

        }
    }
}
