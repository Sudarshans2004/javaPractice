package basicjavacodes;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 5;
        boolean isprime=false;
        for(int i = 2;i<num/2;i++){
            if(num%i==0){
                isprime=true;
                break;
            }else {
                isprime= false;
            }
        }
        System.out.println(isprime);
    }
}
