package Array;

import java.util.ArrayList;
//Write a Java program to convert an ArrayList to an array .
public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);


        int arr[] = new int [list.size()];
            int i=0;
            while( i<list.size()){
                arr[i]= list.get(i);
                System.out.println(arr[i]);
                i++;
            }

    }
}
