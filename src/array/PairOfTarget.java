package array;

public class PairOfTarget {
//    Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
public static void main(String[] args) {
    int x[]={1,2,3,4,5,6};
    int target =6;
    for(int i=0;i<x.length;i++){
        for(int j=i+1;j<x.length;j++){
         if(x[i]+x[j]==target) {
             System.out.println(x[i]+" "+x[j]);
         }
        }
    }
}

}
