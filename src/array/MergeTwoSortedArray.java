package array;

import java.util.Arrays;

public class MergeTwoSortedArray {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int result []=new int [m+n];
            for(int i=0,j=0;i<m;i++){
                result[j]=nums1[i];
                j++;
            }

            for(int i=0,j=0;i<n;i++){
                result[j+m]=nums2[i];
                j++;
            }
            Arrays.sort(result);
            for(int i=0;i<(m+n);i++ ){
                System.out.println(result[i]);
            }
        }

    public static void main(String[] args) {
        int nums1 [] = {1,2,3,0,0,0};
        int nums2 []= {2,5,6};
        int m =3;
        int n=3;
        merge(nums1,m,nums2,n);
    }

}
