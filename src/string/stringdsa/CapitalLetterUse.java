package string.stringdsa;

public class CapitalLetterUse {
    public boolean detectCapitalUse(String word) {

        int count =0;
        char [] ch = word.toCharArray();
        for (int i =0 ; i<ch.length;i++) {
            if (ch[i] <= 91) {
                count++;
            }
        }

        if(count ==ch.length) return true;
        count =0;
        for (int i =0 ; i<ch.length;i++) {
            if(ch[i] >=96 && ch[i]<=122) {
                count++;
            }
        }
        System.out.println(count);
        if(count ==ch.length) return true;
        count =0;
        for (int i =0 ; i<ch.length-1;i++) {
            if(ch[0]>=65 && ch[0]<=91){
                if(ch[i+1] >=97 && ch[i+1]<=122) {
                    count++;
                }
            }
        }
        if(count ==ch.length-1) return true;

        return false;
    }

    public static void main(String[] args) {
       String s = "awefwfjwiafhwafhkwfhawkfhjgfejwgfjwfgzbvfbuwygebfbfvcuawegffyewgbfwuefbubf";
        System.out.println(s.length());
       CapitalLetterUse c = new CapitalLetterUse();
       c.detectCapitalUse(s);
    }
}
