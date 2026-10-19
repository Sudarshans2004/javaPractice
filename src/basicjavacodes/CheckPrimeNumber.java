package basicjavacodes;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int num =18;

        boolean isPrime =true;
        if(num<=1){
            isPrime=false;
        }

        for(int i =2;i<num;i++){

            if(num%i==0){
                isPrime=false;
                break;
            }
        }
    }



}
