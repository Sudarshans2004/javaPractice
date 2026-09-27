package matrices;

public class MatrixDiagonalAddtion {
    public static int diaSum(int[][] mat){
        int ans = 0;
        int m = mat.length;
        for(int i=0;i<m;i++){
            for(int j =0;j<m;j++){
                if(i==j||i+j==m-1){
                    ans+=mat[i][j];
                }
            }
        }
        System.out.println(ans);
        return ans;

    }
    public static void main(String[] args) {
          int [] [] mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
          diaSum(mat);
    }
}
