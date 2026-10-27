package collection.stack;

import java.util.Stack;

public class MaxAreaCoveredByBuilding {

    public static void main(String[] args) {
//        int [] arr = {2,1,5,4,7,6,2,3,10,8,5,6,4,7,2,3,2};
//        int n = arr.length;
//        int max =Integer.MIN_VALUE;
//        for(int i =0;i<n;i++){
//            int count =1;
//
//            int j=i-1;
//            while(j>=0 && arr[j]>=arr[i]){
//                j--;
//                count++;
//            }
//            int k =i+1;
//            while(k<n && arr[k]>=arr[i]){
//                k++;
//                count++;
//            }
//            max = Math.max(max, arr[i] * count);
//        }
//        System.out.println(max);

        int[] arr = {2, 1, 5, 4, 7, 6, 2, 3,
                10, 8, 5, 6, 4, 7, 2, 3, 2};

        int n = arr.length;
        int max = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {

            int currentHeight = (i == n) ? 0 : arr[i];

            while (!stack.isEmpty()
                    && arr[stack.peek()] > currentHeight) {

                int height = arr[stack.pop()];

                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                int area = height * width;
                max = Math.max(max, area);
            }

            stack.push(i);
        }

        System.out.println("Maximum area: " + max);
    }
}
