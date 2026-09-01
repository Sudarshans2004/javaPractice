package string.stringdsa;

import java.util.*;

public class ReverseVowelsOfAString {
        public String reverseVowels(String s) {

            char[] ch = s.toCharArray();

            int left = 0;
            int right = ch.length - 1;

            while (left < right) {

                // Move left until we find a vowel
                while (left < right && !isVowel(ch[left])) {
                    left++;
                }

                // Move right until we find a vowel
                while (left < right && !isVowel(ch[right])) {
                    right--;
                }

                // Swap vowels
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }

            return new String(ch);
        }

        public boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
        }


    public static void main(String[] args) {
        ReverseVowelsOfAString r = new ReverseVowelsOfAString();
        String st = "IceCreAm";
        r.reverseVowels(st);
    }
}
