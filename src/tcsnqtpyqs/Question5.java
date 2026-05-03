package tcsnqtpyqs;

import java.util.Scanner;

//🔷 Question 8 — Merit List After Re-evaluation
//N students have marks M[ ]. If two adjacent students have same marks, the one seated behind is removed from the merit list.
//
//After each of K re-evaluations (each updates one student's marks), print the size of the merit list.
//
//Example:
//
//N=5, M=1 1 2 5 2, K=2
//Re-eval 1: M[1]=3 → marks = 3 1 2 5 2 → Output: 5
//Re-eval 2: M[4]=2 → marks = 3 1 2 2 2 → Output: 3
//Input: N, K, then marks one per line, then K re-evaluations (index and new value) Output: Merit list size after each re-evaluation
public class Question5 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int inp = sc.nextInt();
        int marks[] = {1,2,4,5,6,6};
        int count = 0;

        for(int i =0;i<marks.length-1 ; i++){
            if(marks [i]== marks[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
