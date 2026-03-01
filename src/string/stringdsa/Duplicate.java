package string.stringdsa;

public class Duplicate {

    public static void main(String[] args) {
        String s = "sudarshan";
        String s1 = "";
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)!=s.charAt(j)){
                    s1+=s.charAt(j);
                }

            }


        }
        System.out.println(s1);

    }
}
