package Array;

import java.util.Arrays;

public class SecLargest {
    int largest = Integer.MIN_VALUE;
    int secLar= Integer.MIN_VALUE;
    public int Sec(int num[]){
        for (int i=0;i<num.length;i++){
            if(num[i]>largest){
                secLar=largest;
                 largest=num[i];
            } else if (num[i]>secLar&&num[i]!=largest) {
                num[i]=secLar;
            }
        }
        return secLar;
    }
    public static void main(String[] args) {
        int [] num = {10,70,30,40};
        SecLargest obj= new SecLargest();
        System.out.println(obj.Sec(num));
//        Arrays.sort(num);
//        System.out.println(num[num.length-2]);
    }
}
