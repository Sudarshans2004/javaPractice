package array;
//Write a Java program to remove a specific element from an array.

public class RemovingElement {
    public static void Removing(int []arr){
        int index =2;
        int newArr[]=new int [arr.length-1];
        for(int i=0,j=0;i<arr.length;i++){
            if(i!=index){
                newArr[j++]=arr[i];
            }
        }
        for(int nums:newArr){
            System.out.println(nums);
        }
    }
    public static void main(String[] args) {
        int x []={10,2,4,5,6};
          Removing(x);
    }
}
