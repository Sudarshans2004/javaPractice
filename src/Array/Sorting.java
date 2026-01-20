package Array;

//Write a Java program to sort a numeric array.


public class Sorting {
    public static void  x(int[] arr){

          for(int i =0;i<arr.length;i++ ){
              for(int j=i+1;j<arr.length;j++){
                  if(arr[i]>arr[j]){
                     int temp = arr[i];
                     arr[i]=arr[j];
                      arr[j] = temp;
                  }
              }

          }
          for(int num:arr){
              System.out.println(num+" ");
          }

    }
    public static void main(String[] args) {
        int [] x={1,2,5,9,10,4};
        x(x);
    }
}
