package array;
//find missing element inside sorted array
public class MissingElementInSortedArray {

    public static void main(String[] args) {
//        int [] arr ={1,2,4,5,6};
        int [] arr ={6,5,4,3,1};

        int s = 0;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i+1]-(arr[i])!=1){
                s=arr[i]+1;
            }
            if(arr[i]-arr[i+1]!=1){
                s=arr[i]-1;
            }
        }

        System.out.println(s);
    }
}
