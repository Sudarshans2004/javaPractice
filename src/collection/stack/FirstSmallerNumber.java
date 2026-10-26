package collection.stack;

import java.util.Stack;

public class FirstSmallerNumber {
    public static void main(String[] args) {
        int arr [] = {12,3,15,25,9,12,17,2,5,9,4,8};
        Stack<Integer>stack = new Stack<>();

        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    stack.push(arr[j]);
                    break;
                }
//                else if () {
//
//                }
            }
        }
        System.out.println(stack);
    }
}
