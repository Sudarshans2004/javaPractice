package collection.stack;

public class MaxAreaCoveredByBuilding {

    public static void main(String[] args) {
        int [] arr = {2,1,5,4,7,6,2,3,10,8,5,6,4,7,2,3,2};
        int n = arr.length;
        int max =Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            int count =1;

            int j=i-1;
            while(j>=0 && arr[j]>=arr[i]){
                j--;
                count++;
            }
            int k =i+1;
            while(k<n && arr[k]>=arr[i]){
                k++;
                count++;
            }
            max = Math.max(max, arr[i] * count);
        }
        System.out.println(max);
    }
}
