package interviewbasiccode;

public class ReverseWordsOfString {
    public static void main(String[] args) {
        String s = "Sudarshan Madhusudan Shinde";
        String st[]=s.split(" ");

        for(int i=0;i<st.length;i++){
            StringBuilder sb = new StringBuilder(st[i]);
            System.out.print(sb.reverse()+" ");
        }
    }
}
