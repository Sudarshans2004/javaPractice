package matrices;

public class RotationOfMatrix {
    private static void rotate(int [][] arr){
        int n = arr.length;
        System.out.println(n);
        int rotatedArr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=n-1,k=0;j>=0;j--){
                    rotatedArr[i][k]=arr[j][i];
k++;
            }
        }
        for(int[] row : rotatedArr) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
    public static void main(String[] args) {
        int arr [][]= {{1,2,3,4},{4,5,6,7},{7,8,9,10},{10,11,12}};
        rotate(arr);
    }
}
