package Array;

import java.util.Scanner;

public class FindIndexOfArray {
//    Find index of an element in array
    public static void Index(int arr[]){
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println(i+1);
            }
        }

    }

public static void main(String[] args) {
    int x []={1,2,5,3,6,10};
     Index(x);
   }
}
