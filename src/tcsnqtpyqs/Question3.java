package tcsnqtpyqs;

//Given strings A and B, remove all characters from A that appear in B, to form string C.
//Examples:
//
//A=tiger, B=ti → Output: ger
//        A=processed, B=esd → Output: proc
public class Question3 {
    public static void main(String[] args) {
        String a = "tiger";
        String b = "ti";
        String c ;

        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        for(int i = 0;i<a.length();i++){
            char ch = a.charAt(i);
            if(b.indexOf(ch)==-1){
                sb.append(ch);
            }
        }
        c= sb.toString();
        System.out.println(c);


    }
}
