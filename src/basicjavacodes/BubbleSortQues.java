package basicjavacodes;

public class BubbleSortQues {
    public static String sortSentence(String s) {
        String [] str = s.split(" ");
        String ans [] = new String [str.length];

        for(String st : str){

            int index = st.charAt(st.length()-1)-'1';

            String actualWord= st.substring(0,st.length()-1);
            ans[index]= actualWord;
        }
        return String.join(" ",ans);
    }
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        sortSentence(s);

    }
}
