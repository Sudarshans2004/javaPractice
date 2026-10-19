package basicjavacodes;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "hello";

        int vowel = 0;
        int consonants=0;

        for( char ch : str.toLowerCase().toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ){
                vowel++;
            }else{
                consonants++;
            }
        }

    }
}
