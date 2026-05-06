package string.stringdsa;


public class  MaxThreeDigitInString {

        public static String largestGoodInteger(String num) {

            String s1 = "";
            String s2 = "";
            for (int i = 0; i < num.length() - 2; i++) {
                if (num.charAt(i) == num.charAt(i + 1) &&
                        num.charAt(i) == num.charAt(i + 2)) {
                    s1 = "" + num.charAt(i) + num.charAt(i) + num.charAt(i);
                    s2 = s2 + s1;
                }
            }
            if (s2.length() == 0) {
                return "";
            }

            if (s2.length() == 3) {
                return s2;
            }

            // multiple groups → find max
            String max = s2.substring(0, 3);

            for (int i = 3; i < s2.length(); i += 3) {
                String curr = s2.substring(i, i + 3);

                if (curr.compareTo(max) > 0) {
                    max = curr;
                }
            }
            return max;
        }
    public static void main (String[]args){
        System.out.println(largestGoodInteger("12999777444"));
    }
    }


