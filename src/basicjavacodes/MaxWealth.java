package basicjavacodes;

public class MaxWealth {


    public static int maximumWealth(int[][] accounts) {

        int maxRes = 0;
        for(int i =0; i<accounts.length;i++){
            int result = 0;
            for(int j =0;j<accounts[i].length;j++){
                result+=accounts[i][j];

            }
            maxRes = Math.max(maxRes,result);
        }
        System.out.println(maxRes);
        return maxRes;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{3,2,1}};
        maximumWealth(arr);
    }
}
