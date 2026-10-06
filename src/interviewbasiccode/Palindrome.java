package interviewbasiccode;

public class Palindrome {
    public static void main(String[] args) {
        int x =121;
        int y =x;
        int rev =0;
        while(x!=0){
            int dig = x%10;
            rev = rev*10+dig;
            x/=10;
        }
        if(rev==y){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
