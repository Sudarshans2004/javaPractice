package string.stringdsa;

public class AddingAlterntive {
    public String mergeAlternately(String word1, String word2) {

        int len = word1.length() + word2.length();
        char[] c = new char[len];

        int index = 0;
        int i = 0;
        int j = 0;

        while (i < word1.length() || j < word2.length()) {

            if (i < word1.length()) {
                c[index++] = word1.charAt(i++);
            }

            if (j < word2.length()) {
                c[index++] = word2.charAt(j++);
            }
        }
        String s = new String(c);
        System.out.println(s);
        return new String(c);
    }


    public static void main(String[] args) {
        AddingAlterntive a = new AddingAlterntive();
        a.mergeAlternately("abc","def");
    }
}
