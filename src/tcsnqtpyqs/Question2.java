package tcsnqtpyqs;
//Consider that you are managing an inventory system in a warehouse. Some products are packaged in bulk quantities of 10,
// and these products need to be sent to a different warehouse.
//Your task is to rearrange the inventory list such that all products whose quantities are multiples of 10 are moved to
// the end, while ensuring that the order of the remaining products is not disturbed.
//Problem Statement
//You are given an array of integers representing product quantities. Rearrange the array so that all multiples of 10
// appear at the end of the array, while keeping the relative order of all other elements unchanged.

import java.util.ArrayList;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int arr [] = {10,12, 5 ,6 ,4 ,20,30,23};
        ArrayList<Object> mulptiples = new ArrayList<>();
        ArrayList<Object> nonMulptiples = new ArrayList<>();
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]%10==0){
                mulptiples.add(arr[i]);
            }else {
                nonMulptiples.add(arr[i]);
            }
        }
        nonMulptiples.addAll(mulptiples);
        Integer [] array = nonMulptiples.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
    }
}
