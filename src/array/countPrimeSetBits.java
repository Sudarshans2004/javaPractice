package array;

public class countPrimeSetBits {
int count=0;
int finalCount =0;
    public int countPrimeSetBits(int left, int right) {

        int finalCount = 0;

        for(int i = left; i <= right; i++) {

            int count = 0;

            String binaryStr = Integer.toBinaryString(i);

            for(int j = 0; j < binaryStr.length(); j++) {

                if(binaryStr.charAt(j) == '1') {
                    count++;
                }
            }

            if(isPrime(count)) {
                finalCount++;
            }
        }

        return finalCount;
    }


    private boolean isPrime(int n) {
        for(int i=0;i*i<=n;i++){
            if(i%n==0){
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        countPrimeSetBits c = new countPrimeSetBits();
        c.countPrimeSetBits(6,10);
    }
}
