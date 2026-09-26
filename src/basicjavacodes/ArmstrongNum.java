package basicjavacodes;

public class ArmstrongNum {
    public static boolean armStrong(int num){
        int sum =0;
        int original = num;
        while(num>0){
            int r =num%10;
            sum= sum+r*r*r;
            num=num/10;

        }
        if(original ==sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num =370;
        boolean isArm = armStrong(num);
        System.out.println(isArm);


    }
}
