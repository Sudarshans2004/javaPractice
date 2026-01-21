package Array;

public class TwoSum {
    public static void main(String[] args) {
        int arr1[]= {1,2,3};
        int arr2[]={1,2,3,4};
        int maxLen=Math.max(arr1.length,arr2.length);
        int newArr[]=new int [maxLen];
        for(int i=0;i<maxLen;i++){
            if(i<arr1.length&&i<arr2.length) {
                newArr[i] = arr1[i] + arr2[i];
            } else if(i< arr1.length){
                  newArr[i]=arr1[i];
                }else{
                newArr[i]= arr2.length;
            }
            }

        for(int num:newArr){
            System.out.println(num);
        }
}
    }

