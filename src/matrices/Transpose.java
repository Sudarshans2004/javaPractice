package matrices;

public class Transpose {
    public static int[][] transpose(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int [][] transMatrx = new int [n][m];

//        for(int i=0;i<m;i++){
//
//            for(int j=0;j<n;j++){
//
//                transMatrx[j][i]=matrix[i][j];
//            }
//        }
        for(int i=0;i<m;i++){

            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }


        return transMatrx;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        transpose(arr);
    }
}
