package Array;
//Write a Java program to reverse an array of integer values.
public class Reverse {
    public static void main(String[] args) {
        int x []={1,2,3,4,5,6,7,8,9};
        int newArr []=new int[x.length];
        for(int i=x.length-1;i>=0;i--){
            System.out.println(x[i]);
        }


    }
}
