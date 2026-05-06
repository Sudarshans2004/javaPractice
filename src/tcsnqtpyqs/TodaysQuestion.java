package tcsnqtpyqs;

import java.util.Scanner;

public class TodaysQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;
        if(!(1<=a || a<=6)){
            System.out.println("Invalid ");
        } else if (a==1) {
            System.out.println( (result +=20) + " solution");
        } else if (a==2) {
            System.out.println((result +=56) + " solution");
        }else if (a==3) {
            System.out.println(46+ " solution");
        }else if (a==4) {
            System.out.println(52+ " solution");
        }else if (a==5) {
            System.out.println(10+ " solution");
        }else if (a==6) {
            System.out.println(20+ " solution");
        }else{
            System.out.println("Invalid ");
        }
    }
}
