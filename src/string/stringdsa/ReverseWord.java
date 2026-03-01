package string.stringdsa;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "siddhesh bagged highest package";
        String [] s2 =s.split(" ");
        String s1 [] =new String[s2.length];

        System.out.println(s2[0]);
        for(int i=s2.length-1;i>=0;i--){
            System.out.print(s2[i]+" ");
        }
    }
}
