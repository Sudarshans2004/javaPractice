package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Write a Java program to convert an ArrayList to an array .
public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(10);
        list.add(6);
        list.add(8);
        Collections.sort(list);

        int arr[] = new int [list.size()];
            int i=0;
            while( i<list.size()){
                arr[i]= list.get(i);
                i++;
            }
        System.out.println(Arrays.toString(arr));
            int x = arr.length;
            int y;
            String s= "ncowne";
            s.length();

        Arrays.sort(arr);
        System.out.println(arr);


    }
}
