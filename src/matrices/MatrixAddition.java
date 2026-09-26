package matrices;

public class MatrixAddition {
    public static void main(String[] args) {
        int m=3,n=3;
        int sum=0;
        int arr[][] = {{1,2,3},{4,5,6 },{7,8,9}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
