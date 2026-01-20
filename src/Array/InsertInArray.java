package Array;
//Write a Java program to insert an element (specific position) into an array.
public class InsertInArray {
    public static void Inserting(int []arr){
        int index =2;
        int value = 10;
        int [] newArr = new int[arr.length+1];
        for(int i=0,j=0;i<newArr.length;i++){
            if(i ==index){
                newArr[i]=value;
            }else{
                newArr[i]=arr[j++];
            }
        }
        for(int nums:newArr){
            System.out.print(nums+" ");
        }
    }
    public static void main(String[] args) {
      int x[]={1,2,5,6,6,3,7};
      Inserting(x);
    }
}
