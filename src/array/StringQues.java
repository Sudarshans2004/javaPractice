package array;

public class StringQues {

    public static String toUpperCaseWords(String str) {

        StringBuilder sb = new StringBuilder();

        // Capitalize first character
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(' ');
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi i am sudrshan shinde";
        System.out.println(toUpperCaseWords(str));
    }
}
