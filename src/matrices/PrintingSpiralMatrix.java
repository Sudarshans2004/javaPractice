package matrices;

import java.util.ArrayList;
import java.util.List;

public class PrintingSpiralMatrix {
    List<Integer> list = new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        int m= matrix.length;
        int n=matrix.length;
        for(int i =0;i<m;i++){
            int s=0;
            for(int j=0;j<n;j++){
                list.add(matrix[s][j]);
            }
            for(int k=1;k<n;k++){
            }
        }
        return list;
    }
    public static void main(String[] args) {
       int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
       PrintingSpiralMatrix p = new PrintingSpiralMatrix();
       p.spiralOrder(matrix);
    }
}
