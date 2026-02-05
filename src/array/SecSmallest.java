package array;

public class SecSmallest {
    public static void main(String[] args) {
        int x []={1,2,3,4,8,9};
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int i=0;i<x.length;i++){
                if(x[i]<min){
                    secMin=min;
                    min=x[i];
                } else if (x[i]>min&&x[i]<secMin) {
                    secMin=x[i];
                }
            }

        System.out.println(secMin);
    }
}
