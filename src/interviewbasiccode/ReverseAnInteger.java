package interviewbasiccode;

import static java.lang.Integer.parseInt;

public class ReverseAnInteger {
    public static void main(String[] args) {

        int x = 4321;
//        String s= Integer.toString(x);
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        int reversed=parseInt(String.valueOf(sb));
//        System.out.println(reversed);
        int i=0;
        while(x!=0){
         int digit = x%10;
         i=i*10+digit;
         x/=10;
        }
        System.out.println(i);
    }
}
