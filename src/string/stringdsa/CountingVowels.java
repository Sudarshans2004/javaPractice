package string.stringdsa;


public class CountingVowels {

    public static void main(String[] args) {
        String s = "Sudarshan";
        int count =0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
//            if(s.charAt(i) == 'a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
//                count++;
//            }
            if(c == 'a'|| c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
