package array;

public class CommonElementsInTwoArray {
    public static void main(String[] args) {
        String[] arr1 = {"apple", "banana", "mango"};
        String[] arr2 = {"grapes", "banana", "orange", "mango"};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}
