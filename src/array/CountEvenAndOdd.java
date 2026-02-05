package array;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        int arr []={0,1,2,3,4,5,6};
        int even =0;
        int odd =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            } else if (arr[i]==0) {
                even++;
            } else{
                odd++;
            }
        }
        System.out.println(even+"--"+odd);
    }
}
