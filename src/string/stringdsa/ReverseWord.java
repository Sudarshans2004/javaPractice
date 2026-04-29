package string.stringdsa;

public class ReverseWord {
    public static void main(String[] args) {
//        String s = "siddhesh bagged highest package";
//        String [] s2 =s.split(" ");
//        String s1 [] =new String[s2.length];
        String s = "Sudarshan Shinde";
        String s2 [] = s.split(" ");
         int uu = s2.length;
        System.out.println(uu);

        for(int i=s2.length-1;i>=0;i--){
            System.out.print(s2[i]+" ");
        }
    }
}
