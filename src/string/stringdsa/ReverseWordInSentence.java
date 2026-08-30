package string.stringdsa;

public class ReverseWordInSentence {
        public String reverseWords(String s) {
            String result = "";
            String finalStr ="";
            String[] arr = s.split(" ");
            for(int i =0; i< arr.length;i++){
                StringBuilder st = new StringBuilder(arr[i]);
                 result +=st.reverse()+ " ";
                 finalStr = result.stripTrailing();
            }
            System.out.println(result);
            return finalStr;
        }
        public static void main(String[] args) {
            String s ="Let's take LeetCode contest";
            ReverseWordInSentence r = new ReverseWordInSentence();
            r.reverseWords(s);
        }

}
