package array;

import java.util.ArrayList;
//Write a Java program to convert an array to an ArrayList.
public class ArrayToArrayList {
    public static void main(String[] args) {
        int x[] = {1,2,3,4,5,6};
        ArrayList<Integer>list =new ArrayList<>();

        for(int num:x){
            list.add(num);
        }
        System.out.println(list);
    }
}
