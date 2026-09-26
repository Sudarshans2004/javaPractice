package matrices;

public class MatrixColumnAddition {
    public static void main(String[] args) {
        int n=3;
        int sum=0;
         int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
         for(int i=0;i<n;i++){
             sum=0;
             for(int j=0;j<n;j++){
                 sum +=arr[j][i];
             }
             System.out.println(sum);
         }
    }
}
