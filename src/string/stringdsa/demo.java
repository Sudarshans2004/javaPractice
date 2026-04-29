package string.stringdsa;

public class demo {
    public static void main(String[] args) {
        String s= "sudarshan";
//       for( char c[] =  s.toCharArray();;){
//           System.out.println(c);
//       }
        String s1 = "Sudarshan Shinde";
        String b[] = s1.split(" ");
//        for(int i =b.length-1;i>=0 ; i--){
//            System.out.println(b[i]);
//        }
        for(int j = 0; j<b.length;j++){
            for(int i =b[j].length()-1;i>=0 ; i--){
                System.out.print(b[j].charAt(i));
            }
        }


    }
}
