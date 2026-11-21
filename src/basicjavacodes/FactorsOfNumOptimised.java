package basicjavacodes;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfNumOptimised {
    public static void main(String[] args) {
          sqrtOptimised(4);
//          sqrtOptimisedSorted(20);

    }
    static void sqrtNormal(int num){
        for (int i = 0; i <= num; i++) {
            if(num%i==0){
                System.out.println(i + " ");
            }
        }
    }
    static void sqrtOptimised(int num){
        for (int i = 1; i <= Math.sqrt(num); i++) {
                if(num%i==0){
                    if(num/i==i){
                        System.out.print(i+" ");
                    }else {
                        System.out.print(i+" "+num/i + " ");

                    }
                }
        }
    }
    static void sqrtOptimisedSorted(int num){
        int count = 0;
        List<Integer>li = new ArrayList<>() ;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num%i==0){
                if(num/i==i){
                    System.out.print(i+" ");
                    count++;
                }else {
                    System.out.print(i+" ");
                    count++;
                   li.add(num/i);

                }
            }
        }

        for (int i = li.size()-1; i >=0 ; i--) {
            System.out.print(li.get(i)+ " ");
        }
        System.out.println(count);
    }

}
