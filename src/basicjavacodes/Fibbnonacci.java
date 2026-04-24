package basicjavacodes;

public class Fibbnonacci {
    //0 1 1 2 3 5 8 13 21 34
    public static void main(String[] args) {
        int i =0,j=1;
        System.out.println(i +" "+ j+ " ");
        for(int k =0;k<10;k++){
            int c=i+j;
            System.out.println(c+" ");
            i=j;
            j=c;

        }
    }
}
