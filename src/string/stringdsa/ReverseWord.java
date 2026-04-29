package string.stringdsa;

public class ReverseWord {
    public static void main(String[] args) {
//        String s = "siddhesh bagged highest package";
//        String [] s2 =s.split(" ");
//        String s1 [] =new String[s2.length];
        String s = "Sudarshan Shinde";
        String s2 [] = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s2[i].length();i++){
            System.out.print(s2[i]+" ");
             String word = s2[i];
             StringBuilder temp = new StringBuilder(word);
            res.append(temp.reverse());
        }
        System.out.println(res);
    }
}
