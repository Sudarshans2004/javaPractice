package array;
//.Checks whether the array is sorted or not
public class ArraySortedOrNot {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6};
//        int [] arr = {6,5,4,3,2,1};
        boolean asc = false;
        boolean dec = false;

        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) {
                dec = true;
            }
            if(arr[i]<arr[i+1]){
                asc=true;
            }
        }
        if(asc||dec){
            System.out.println("sorted");
        }else{
            System.out.println("Not Sorted");
        }
    }
}
