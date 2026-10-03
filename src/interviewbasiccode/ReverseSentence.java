package interviewbasiccode;

public class ReverseSentence {
    public static void main(String[] args) {
        String s = "Sudarshan Madhusudan Shinde";
        String [] st = s.split(" ");
        for(int i=st.length-1;i>=0;i--){
//            System.out.print(st[i] +" ");
        }
        StringBuilder word = new StringBuilder(s);
        StringBuilder sentence = new StringBuilder(s);

        for(int i=s.length()-1;i>=0;i--){

            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }else{
                sentence.append(word.reverse().append(" "));
                        word.setLength(0);
            }
        }
        sentence.append(word.reverse());
        System.out.println(sentence);

    }
}
